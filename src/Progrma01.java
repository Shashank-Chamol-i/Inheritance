class Employee
{
    float salary = 500;
}
class programmer extends Employee
{
    int age = 22;
}
public class Progrma01 {
    public static void main(String[] args)
    {
       programmer p = new programmer();
        System.out.println(p.salary);
        System.out.println(p.age);
    }
}
