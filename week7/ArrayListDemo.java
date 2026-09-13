import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[] args) {
// Creating an ArrayList of Strings
ArrayList<String> fruits = new ArrayList<>();
// Adding elements
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Mango");
fruits.add("Banana"); // duplicate allowed
System.out.println("ArrayList: " + fruits);

// Accessing an element
System.out.println("Element at index 1: " + fruits.get(1));

// Modifying an element
fruits.set(2, "Orange");
System.out.println("After update: " + fruits);

// Inserting at a specific index
fruits.add(1, "Grapes");
System.out.println("After insertion: " + fruits);
// Removing an element (by index)
fruits.remove(0);
System.out.println("After removing index 0: " + fruits);
// Removing an element (by object/value)
fruits.remove("Banana"); // removes first occurrence
System.out.println("After removing 'Banana': " + fruits);

// Checking size
System.out.println("Size: " + fruits.size());
// Checking if element exists
System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

// Traversing using for-each loop
System.out.println("Traversing with for-each:");
for (String fruit : fruits) {
System.out.println(fruit);
}
}
}