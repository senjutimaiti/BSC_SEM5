class SuperMan
{
    void display()
    {
        System.out.println("Super class");
    }

    void printy()
    {
        System.out.println("SuperMan Baby");
    }
}

interface Interest
{
    void show();
}

class Baby extends SuperMan implements Interest
{
    
    @Override
    void display()
    {
        printy();
        System.out.println("Baby class");
    }

    @Override
    public void show()
    {
        System.out.println("Interest here!");
    }

    @Override
    public String toString()
    {
        return "My name is Baby SuperMan";
    }
}

public class Test4 
{
    public static void main(String[] args)
    {
        Baby ob = new Baby();
        ob.display();
        ob.show();
        System.out.println(ob);
    }
}
