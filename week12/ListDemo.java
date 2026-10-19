import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Apple");
        aList.add("Banana");
        aList.add("Mango");
        System.out.println("ArrayList: " + aList);
        aList.remove("Banana");
        System.out.println("After removal: " + aList);
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Blue");
        System.out.println("LinkedList: " + lList);
        lList.addFirst("Yellow");
        lList.addLast("White");
        System.out.println("After adding elements: " + lList);
    }
}
