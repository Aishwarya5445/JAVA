package week2;

public class fibonacci {
    public static void main(String args[]){
        int n=10; // here n=10 means 10 terms
        int first=0,second=1;
        System.out.println("::Fibonacci Sequence::");
        for (int i=1; i<=n; i++)
        {
            System.out.println(first+" ");
            int next= first+second;
            first = second;
            second=next;
        }
    }
}