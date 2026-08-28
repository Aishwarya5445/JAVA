import mypack.Shapes;

public class Circles {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.message();

        double radius = 5;
        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}