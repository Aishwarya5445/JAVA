class Parent
{
int num = 100;
}
class Child extends Parent 
{
int num = 200;
void show() {
System.out.println(super.num); // Access parent variable → 100
System.out.println(num); // Access child variable → 200
}
}
public class TestSuper 
{
public static void main(String[] args) 
{
Child c = new Child();
c.show();
}
}
