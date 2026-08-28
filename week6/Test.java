import p1.Demo;

public class Test {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println("Accessing member of package p1:");
        System.out.println("Number = " + obj.number);

        obj.display();
    }
}
