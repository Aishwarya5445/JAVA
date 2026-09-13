import java.lang.reflect.*;
class Student {
private int id;
protected String name;
public double marks;
public Student() { }

private void display() { }
public void printDetails(String s) { }
}
public class ReflectClassInfo {
public static void main(String[] args) {
try {

// 1. Using .class syntax
Class c1 = Student.class;

// 2. Using getClass() on an object
Student s = new Student();
Class c2 = s.getClass();

// 3. Using Class.forName()
Class c3 = Class.forName("Student");
System.out.println("Class Name (c1): " + c1.getName());
System.out.println("Class Name (c2): " + c2.getName());
System.out.println("Class Name (c3): " + c3.getName());

System.out.println("\nSimple Name: " + c1.getSimpleName());
System.out.println("Package: " + c1.getPackage());

// Modifiers of the class
int modifiers = c1.getModifiers();
System.out.println("Modifiers: " + Modifier.toString(modifiers));

// Superclass
System.out.println("Superclass: " + c1.getSuperclass().getName());

// Interfaces implemented
Class[] interfaces = c1.getInterfaces();
System.out.println("Number of interfaces: " + interfaces.length);

} catch (ClassNotFoundException e) {
System.out.println("Class not found: " + e);
}
}
}