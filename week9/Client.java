import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Socket s = new Socket("localhost", 5000);

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

            dos.writeDouble(radius);

            DataInputStream dis =
                new DataInputStream(s.getInputStream());

            double area = dis.readDouble();

            System.out.println("Area of circle = " + area);

            dis.close();
            dos.close();
            s.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}