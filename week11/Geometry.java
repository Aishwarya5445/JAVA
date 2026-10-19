
abstract class Shape {
    abstract void numberOfSides();
}

class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class Geometry {
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid();
        Triangle tr = new Triangle();
        Hexagon h = new Hexagon();

        t.numberOfSides();
        tr.numberOfSides();
        h.numberOfSides();
    }
}
