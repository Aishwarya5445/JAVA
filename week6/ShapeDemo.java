    abstract class Shape {
        abstract double area(); 
        void describe() { 
        System.out.println("I am a shape with area = " + area());
        }
        }
        class Circle extends Shape {
        double radius;
        Circle(double radius) 
        {
             this.radius = radius; 
            }
        @Override
        double area() {
        return Math.PI * radius * radius;
        }
        }
        class Rectangle extends Shape {
        double length, breadth;
        Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        }
        @Override
        double area() {
        return length * breadth;
        }
        }
        public class ShapeDemo {
        public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        s1.describe(); 
        s2.describe(); 
        
        }
    }
    
