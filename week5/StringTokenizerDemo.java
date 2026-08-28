import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers:");
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;
        System.out.println("Integers are:");
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
