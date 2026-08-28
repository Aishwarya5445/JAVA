import java.io.File;
import java.util.Scanner;
public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File exists");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            if (file.isFile())
                System.out.println("Type: File");
            else
                System.out.println("Type: Directory");

            System.out.println("Length: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
