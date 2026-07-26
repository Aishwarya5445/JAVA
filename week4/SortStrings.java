import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] str = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        Arrays.sort(str);

        System.out.println("Sorted Strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        sc.close();
    }
}
