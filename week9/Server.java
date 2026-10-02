import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected.");

            DataInputStream dis =
                new DataInputStream(s.getInputStream());

            double radius = dis.readDouble();

            double area = Math.PI * radius * radius;

            DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

            dos.writeDouble(area);

            System.out.println("Radius received: " + radius);
            System.out.println("Area calculated: " + area);

            dos.close();
            dis.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}