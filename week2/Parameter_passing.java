class Number {
    int value;
}

public class Parameter_passing {

    // Call by Value (Primitive)
    static void changeValue(int x) {
        x = x + 10;
        System.out.println("value inside method:"+x);
    }

    // Object Reference
    static void changeReference(Number n) {
        n.value = n.value + 10;
        System.out.println("value inside method:"+n.value);
    }

    public static void main(String[] args) {

        // Call by Value
        int a = 20;
        System.out.println("Before call by value: " + a);
        changeValue(a);
        System.out.println("After call by value: " + a);

        // Object Reference
        Number obj = new Number();
        obj.value = 20;
        System.out.println("\nBefore object reference: " + obj.value);
        changeReference(obj);
        System.out.println("After object reference: " + obj.value);
    }
}