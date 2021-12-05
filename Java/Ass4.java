
//A class called MyPoint, which models a 2D point with x and y coordinates.
class MyPoint
{
    //Two instance variables x (int) and y (int).
    int x, y;

    //A default (or "no-argument" or "no-arg") constructor that construct a point at the default location of (0, 0).
    MyPoint()
    {
        x = 0;
        y = 0;
    }

    //A overloaded constructor that constructs a point with the given x and y coordinates.
    MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //A method setXY() to set both x and y.
    public void setXY(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    //A method getXY() which returns the x and y in a 2-element int array.
    public int[] getXY()
    {
        int a[] = new int [2];
        a[0] = x; a[1] = y;

        return a;
    }

    //A toString() method that returns a string description of the instance in the format "(x, y)".    
    public String tostring()
    {
        return "("+Integer.toString(x)+", "+Integer.toString(y)+")";
    }

    /*A method called distance(int x, int y) that returns the distance from this point to another point at the
    given (x, y) coordinates, Write the MyPoint class.*/
    public double distance(int x, int y)
    {
        return Math.sqrt(Math.pow(x-this.x, 2)+Math.pow(y-this.y, 2));
    }

    /*Also write a test driver (called TestMyPoint) to test
    all the public methods defined in the class*/

    public void TestMyPoint()
    {
        MyPoint obj = new MyPoint(1,1);
        String init = obj.tostring();
        System.out.println("\n"+init);
        
        obj.setXY(3,1);
        init = obj.tostring();
        System.out.println("\n"+init);

        double result = obj.distance(6,5);
        System.out.println("The distance between two points are: "+result);
    }
}

public class Ass4
{
    public static void main(String[] args)
    {
        MyPoint ob = new MyPoint();
        ob.TestMyPoint();
    }
}

