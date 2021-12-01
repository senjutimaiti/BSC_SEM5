
abstract class Animal
{
    protected String Species;
    protected String Lifespan;
    protected String Kingdom;

    Animal(String Species, String Kingdom, String Lifespan)
    {
        this.Species = Species;
        this.Kingdom = Kingdom;
        this.Lifespan = Lifespan;
    }

    abstract void speak();
    abstract void printDetails();
    static boolean canBeTamed(boolean value)
    {
        return value;
    }
}

class Dog extends Animal
{
    String name;
    String breed;
    int speed;

    Dog(String Species, String Kingdom, String Lifespan, String name, String breed, int speed)
    {
        super(Species, Kingdom, Lifespan);
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    void speak()
    {
        System.out.println(name+" said Woof!");
    }

    void printDetails()
    {
        System.out.println(super.Species+" "+super.Kingdom+" "+super.Lifespan+" "+name+" "+breed+" "+speed);
    }

    void Tamed()
    {
        boolean isTamed = super.canBeTamed(true);
        System.out.println("Can be Tamed? "+isTamed);
    }
}

class Lion extends Animal
{
    String name;
    String breed;
    int speed;

    Lion(String Species, String Kingdom, String Lifespan, String name, String breed, int speed)
    {
        super(Species, Kingdom, Lifespan);
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    void speak()
    {
        System.out.println(name+" said Rawr!");
    }

    void printDetails()
    {
        System.out.println(super.Species+" "+super.Kingdom+" "+super.Lifespan+" "+name+" "+breed+" "+speed);
    }

    void Tamed()
    {
        boolean isTamed = super.canBeTamed(false);
        System.out.println("Can be Tamed? "+isTamed);
    }
}

public class A17 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Dog","Animal","20yrs","Pogo","Beagle",1);
        dog.speak();
        dog.printDetails();
        dog.Tamed();

        Lion lion = new Lion("Lion","Animal","30yrs","Poop","Yellow",25);
        lion.speak();
        lion.printDetails();
        lion.Tamed();
    }
}
