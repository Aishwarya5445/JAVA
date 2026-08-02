class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends A {
    void showC() {
        System.out.println("Class C");
    }
}
class D extends B{
    void showD(){
        System.out.println("Class D");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        D obj = new D();
        C obj1 = new C();

        obj1.showA();
        obj.showB();
        obj1.showC();
        obj.showD();
    }
}