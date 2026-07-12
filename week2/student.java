package week2;

public class student {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Aishwarya";
        s1.age = 19;
        student s2 = new student();
        s2.name = "Harika";
        s2.age = 19;
        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println();
        System.out.println("Student 2 Details:");
        s2.display();
}
}
