
public class CountObject
{
    private static int count = 0;
    public int roll;
    public String name;
    public CountObject()
    {
        count++;
    }
    public CountObject(int r, String n)
    {
        roll=r;
        name=n;
        count++;
    }
    public void display()
    {
        System.out.println("Roll = "+roll+" Name = "+name);
    }
    public static void main(String args[])
    {
        CountObject ob1 = new CountObject();
        CountObject ob2 = new CountObject(1,"Suman");
        CountObject ob3 = new CountObject();
        CountObject ob4 = new CountObject(2,"Kiran");
        CountObject ob5 = new CountObject();
        CountObject ob6 = new CountObject();
        System.out.println("No. of objects created : "+count);
    }
}