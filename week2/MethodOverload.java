class Adder{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a, int b,int c)
    {
        return a+b+c;
    }
}
public class MethodOverload{
    public static void main(String args[])
    {
        System.out.println("::Method Overloading::");
        System.out.println("adding two numbers using add method:"+Adder.add(11,11));
        System.out.println("adding three numbers using add method:"+Adder.add(11,11,11));

    }
}
