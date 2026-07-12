package week1;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        
        if(a == 0) {
            System.out.println("This is not a quadratic equation.");
            return;
        }
        
        double d = (b * b) - (4 * a * c); // discriminant
        System.out.println("Discriminant D = " + d);
        
        if(d > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Nature of roots: Real and Distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        else if(d == 0) {
            // Two real and equal roots
            double root = -b / (2 * a);
            System.out.println("Nature of roots: Real and Equal");
            System.out.println("Root 1 = Root 2 = " + root);
        } 
        else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Nature of roots: Complex and Imaginary");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }
        
        sc.close();
    }
}
