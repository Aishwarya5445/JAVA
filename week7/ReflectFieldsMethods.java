import java.lang.reflect.*;
class Employee {
private int empId;
private String empName;
public double salary;

public Employee(int empId, String empName, double salary) {
this.empId = empId;
this.empName = empName;
this.salary = salary;
}

public void showDetails() {
System.out.println("Employee ID: " + empId + ", Name: " + empName + ", Salary: " + salary);
}
private void giveBonus(double bonus) {
salary += bonus;
System.out.println("Bonus added. New Salary: " + salary);
}
public int addNumbers(int a, int b) {
return a + b;
}
}
public class ReflectFieldsMethods {
public static void main(String[] args) {
try {
Employee emp = new Employee(101, "Leela", 50000.0);
Class cls = emp.getClass();

System.out.println("---- Fields ----");
Field[] fields = cls.getDeclaredFields();
for (Field f : fields) {
f.setAccessible(true); // allow access to private fields
System.out.println("Field: " + f.getName() +", Type: " + f.getType().getSimpleName() +
", Value: " + f.get(emp));
}
// Modify a private field using reflection
Field nameField = cls.getDeclaredField("empName");
nameField.setAccessible(true);
nameField.set(emp, "Leela Prasad");
System.out.println("\nModified empName field to: " + nameField.get(emp));
System.out.println("\n---- Methods ----");
Method[] methods = cls.getDeclaredMethods();
for (Method m : methods) {
System.out.println("Method: " + m.getName() +
", Return type: " + m.getReturnType().getSimpleName());
}
// Invoke a public method
Method showMethod = cls.getMethod("showDetails");
showMethod.invoke(emp);

// Invoke a public method with parameters
Method addMethod = cls.getMethod("addNumbers", int.class, int.class);
Object result = addMethod.invoke(emp, 15, 25);
System.out.println("Result of addNumbers(15,25): " + result);

// Invoke a private method
Method bonusMethod = cls.getDeclaredMethod("giveBonus", double.class);
bonusMethod.setAccessible(true);
bonusMethod.invoke(emp, 5000.0);

} catch (Exception e) {
System.out.println("Exception: " + e);

}
}
}