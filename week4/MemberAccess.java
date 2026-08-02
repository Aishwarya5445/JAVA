class AccessDemo {
    int defaultVar = 10;          // Default access
    private int privateVar = 20;  // Private access
    protected int protectedVar = 30; // Protected access
    public int publicVar = 40;    // Public access
    void showPrivate() {
        System.out.println("Private Variable: " + privateVar);
    }
}
public class MemberAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);
        obj.showPrivate();
    }
}
