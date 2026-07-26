public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String s3 = "Java";
        // charAt()
        System.out.println("charAt(2): " + s1.charAt(2));
        // compareTo()
        System.out.println("compareTo: " + s1.compareTo(s2));
        // equals()
        System.out.println("equals: " + s1.equals(s3));
        // indexOf()
        System.out.println("indexOf('a'): " + s1.indexOf('a'));
        // join()
        System.out.println("join: " + String.join("-", s1, s2));
        // replace()
        System.out.println("replace: " + s1.replace('a', 'o'));
        // substring()
        System.out.println("substring: " + s2.substring(3));
        // toUpperCase()
        System.out.println("toUpperCase: " + s1.toUpperCase());
        // toLowerCase()
        System.out.println("toLowerCase: " + s2.toLowerCase());
    }
}
