class ExceptionsDemo {
public static void main(String[] args) {
try {
int a = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Caught:" + e);
} finally {
System.out.println("Finally block always runs");
}
}
}
