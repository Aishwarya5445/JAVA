class Student_info
{
    int id;
    String name;
    Student_info(int i ,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
    System.out.println("id: "+id+"  Name: "+name);
    }
    public static void main(String args[])
    {
        Student_info s1=new Student_info(515,"Aishwarya");
        Student_info s2 =new Student_info(151,"Harika");
        s1.display();
        s2.display();
    }
}
