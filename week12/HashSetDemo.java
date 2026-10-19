import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> empIds = new HashSet<>();
        empIds.add(101);
        empIds.add(102);
        empIds.add(103);
        empIds.add(104);
        empIds.add(102);
        System.out.println("Employee IDs: " + empIds);
    }
}
