/*WAP in java to create Box class with parameterized constructor with an object argument to
initialize length, breadth and height also create a function volume which returns the volume
of the box and print it in main method.*/
import java.util.*;
    class Box {
    double l,b,h;

     Box(double length, double breadth, double height)
    {
        l=length;
        b=breadth;
        h=height;
    }
    double volume()
    {
		double v;
		v=l*b*h;
		return v;
    }
}


class A04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length, breadth, height");
		double l= sc.nextDouble();
		double b= sc.nextDouble();
		double h= sc.nextDouble();
		sc.close();
		if(l>0 && b>0 && h>0)
		{
			Box bc = new Box(l,b,h);
			System.out.println( "Volume: " + bc.volume());
		}
		else
			System.out.println( "Invalid Input");	
		
	}
}	