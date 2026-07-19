import java.util.*;

public class ArrayDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // ----- 1D Array -----
        System.out.println("Enter the size of 1D array:");
        int n = sc.nextInt();

        int[] arr1D = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr1D[i] = sc.nextInt();
        }

        System.out.println("Elements of 1D array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1D[i] + " ");
        }

        // ----- 2D Array -----
        System.out.println("\nEnter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}