package week1;

public class operators {
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println("::Increment / Decrement Operators::");
        System.out.println("initial a="+a+", b="+b);
        //increment
        System.out.println("pre-increment ++a:"+(++a));
        System.out.println("post-increment a++:"+(a++));
        System.out.println("after post-increment a:"+a);
        //decrement
        System.out.println("pre-Decrement --b:"+(--b));
        System.out.println("post-Decrement b--:"+(b--));
        System.out.println("After post-Decrement b"+b);
        System.out.println("\n::Bitwise Operators::");
        int x=12;
        int y=10;
        System.out.println("x="+x+"->"+Integer.toBinaryString(x));
        System.out.println("y="+y+"->"+Integer.toBinaryString(y));
        System.out.println("\n bitwise AND x&y:"+(x&y)+"->"+Integer.toBinaryString(x&y));
        System.out.println("\n bitwise OR x|y:"+(x|y)+"->"+Integer.toBinaryString(x|y));
        System.out.println("\n bitwise XOR x^y:"+(x^y)+"->"+Integer.toBinaryString(x^y));
        System.out.println("\n bitwise NOT ~x:"+(~x)+"->"+Integer.toBinaryString(~x));
        System.out.println("\n left shift x<<2:"+(x<<2)+"->"+Integer.toBinaryString(x<<2));
        System.out.println("\n right shift x>>2:"+(x>>2)+"->"+Integer.toBinaryString(x>>2));
        System.out.println("\n unsigned right shift x>>>2:"+(x>>>2));
    }
    
}
