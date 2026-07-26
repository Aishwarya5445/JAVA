public class StringBufferMethods {
    public static void main(String[] args) {

        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        // 1. append()
        sb.append(" Programming");
        System.out.println("After append(): " + sb);

        // 2. insert()
        sb.insert(5, "Language ");
        System.out.println("After insert(): " + sb);

        // 3. replace()
        sb.replace(5, 13, "Coding ");
        System.out.println("After replace(): " + sb);

        // 4. delete()
        sb.delete(5, 12);
        System.out.println("After delete(): " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }
}