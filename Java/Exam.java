interface A{
    interface B{
        void display();
    }
}
abstract class Shape{
    abstract void area();
}
class Exp extends Shape implements A.B
{
    @Override
    void area()
    {
        System.out.println("Extended abstract class");
    }

    @Override
    public void display()
    {
        System.out.println("Nested interface");
    }
}
public class Exam{
    public static void main(String[] args)
    {
        Exp ob = new Exp();
        ob.area();
        ob.display();
    }
}