class Animal
{
    String species;
    int age;
    Animal(String species,int age)
    {
        this.species = species;
        this.age = age;
    }
    void display()
    {
        System.out.println("The species of animal is  : "+species);
        System.out.println("The age of the animal is : "+age);
    }
}
class Mammals extends Animal
{
    boolean hasfur;
    Mammals(String species,int age,boolean hasfur)
    {
        super(species,age);
        this.hasfur=hasfur;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Mammals have fur : "+hasfur);
    }
}
class Dog extends Mammals
{
    String breed;
    Dog(String species,int age,boolean hasfur,String breed)
    {
        super(species,age,hasfur);
        this.breed=breed;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("The breed of dog is : "+breed);
    }
}
public class Program04 {
    public static void main(String[] args)
    {
        Dog dd = new Dog("Canine",5,true,"Labrador");
        dd.display();
    }
}
