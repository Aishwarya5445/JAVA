import java.lang.reflect.*;
class Product {
private int prodId;
private String prodName;
private double price;

// Default constructor
public Product() {
System.out.println("Default Constructor called");
}

// Parameterized constructor
public Product(int prodId, String prodName, double price) {
this.prodId = prodId;
this.prodName = prodName;
this.price = price;
System.out.println("Parameterized Constructor called");
}

// Private constructor
private Product(String prodName) {
this.prodName = prodName;
System.out.println("Private Constructor called with name: " + prodName);
}

public void display() {
System.out.println("Product[id=" + prodId + ", name=" + prodName + ", price=" + price
+ "]");
}

}

public class ReflectConstructor {
public static void main(String[] args) {
try {
Class cls = Class.forName("Product");

System.out.println("---- All Constructors and Parameters ----");
Constructor[] constructors = cls.getDeclaredConstructors();
for (Constructor c : constructors) {
System.out.println("\nConstructor: " + c.getName());
System.out.println("Modifier: " + Modifier.toString(c.getModifiers()));

Class[] paramTypes = c.getParameterTypes();
System.out.println("Number of parameters: " + paramTypes.length);
for (int i = 0; i < paramTypes.length; i++) {
System.out.println(" Parameter " + (i + 1) + " type: " +
paramTypes[i].getSimpleName());
}
}

System.out.println("\n---- Invoking Constructors ----");

// Invoke default constructor
Constructor defCons = cls.getConstructor();
Object obj1 = defCons.newInstance();

// Invoke parameterized constructor
Constructor paramCons = cls.getConstructor(int.class, String.class, double.class);
Object obj2 = paramCons.newInstance(501, "Laptop", 55000.0);
((Product) obj2).display();

// Invoke private constructor
Constructor privCons = cls.getDeclaredConstructor(String.class);
privCons.setAccessible(true);
Object obj3 = privCons.newInstance("Wireless Mouse");
((Product) obj3).display();

} catch (Exception e) {
System.out.println("Exception: " + e);
}
}
}