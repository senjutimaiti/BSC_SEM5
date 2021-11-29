/*WAP in java to create Box class with parameterized constructor with an object argument to
initialize length, breadth and height also create a function volume which returns the volume
of the box and print it in main method.*/

import java.util.Scanner;
class Box
{
	Box(A04 v)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length:");
		v.l=sc.nextFloat();
		
		System.out.print("Enter the breadth:");
		v.b=sc.nextFloat();
		
		System.out.print("Enter the height:");
		v.h=sc.nextFloat();
		
		sc.close();
	}
	float volume(A04 v)
	{
		return (v.l*v.b*v.h);
	}
}

class A04
{
	static float l,b,h;
	A04()
	{
		l=0;
		b=0;
		h=0;
	}
	public static void main(String args[])
	{
		A04 v=new A04();
		Box bx=new Box(v);	
		if((l<=0)||(b<=0)||(h<=0))
		{
			System.out.println("Invalid input");
			return;
		}
		float vol=bx.volume(v);
		System.out.println("Volume of the box="+vol);
	}
}	