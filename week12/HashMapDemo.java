import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> employees = new HashMap<>();
        // Add employee names and salaries
        employees.put("Ravi", 30000.0);
        employees.put("Sita", 40000.0);
        employees.put("Rahul", 35000.0);
        System.out.println("Employee Details: " + employees);
        // Retrieve salary
        System.out.println("Ravi's Salary: " + employees.get("Ravi"));
        // Update salary
        employees.put("Ravi", 45000.0);
        System.out.println("Updated Ravi's Salary: " + employees.get("Ravi"));
    }
}
