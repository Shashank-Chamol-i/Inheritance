class Vehicle
{
    String model;
    int year;
    Vehicle(String model, int year)
    {
        this.model = model;
        this.year = year;
    }
    void display()
    {
        System.out.println("The model is : "+model);
        System.out.println("The year is : "+year);
    }

}
class Car extends Vehicle
{
    String fuelType;
    Car(String model,int year,String fuelType)
    {
        super(model,year);
        this.fuelType = fuelType;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("The type of fuel :"+fuelType);
    }
}
public class Program02 {
    public static void main(String[] args)
    {
        Car c = new Car("Toyota Carmy",2011,"Gasoline");
        c.display();
    }

}
