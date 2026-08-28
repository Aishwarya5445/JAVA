class Student {
    int rollNo;
    String name;
    final String college = "ABC College";
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("College: " + college);
    }
}
public class ThisFinalDemo {
    public static void main(String[] args) {
        Student s1 = new Student(517,"Aishwarya");
        Student s2 = new Student(517, "Harika");
        s1.display();
        System.out.println();
        s2.display();
    }
}

