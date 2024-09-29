class Employe
{
    int id;
    String name;
    double salary;
    Employe(int id,String name,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("The ID of employee is  : "+id);
        System.out.println("The name of employee : "+name);
        System.out.println("The salary of employee : "+salary);
    }
}
class Manager extends Employe
{
    String department;
    Manager(int id,String name,double salary)
    {
        super(id,name,salary);
        this.department = department;
    }
    double calculateBonus(double salary)
    {
        double bonus;
        return bonus=salary*10/100;
    }
}
public class Program03 {
    public static void main(String[] args)
    {
        Manager m = new Manager(1,"Bislesh",99900);
        m.display();
        System.out.println("Bonus : "+m.calculateBonus(99900));
    }
}
