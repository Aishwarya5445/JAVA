public class StaticDemo {

    // Static variable
    static String college = "ABC Engineering College";

    // Instance variable
    String studentName;

    // Static block
    static {
        System.out.println("Static block executed.");
    }

    // Constructor
    StaticDemo(String name) {
        studentName = name;
    }

    // Static method
    static void displayCollege() {
        System.out.println("College Name: " + college);
    }

    // Instance method
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {

        // Calling static method
        displayCollege();

        // Creating objects
        StaticDemo s1 = new StaticDemo("Aishwarya");
        StaticDemo s2 = new StaticDemo("Harika");

        // Calling instance methods
        s1.displayStudent();
        s2.displayStudent();
    }
}
