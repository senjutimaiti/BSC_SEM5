/*
Define a class Clock that does the following: -
a. Accept hours, minutes and seconds.
b. Check the validity numbers.
c. Set the time to AM/PM mode.
Use necessary constructors and methods to do the above task.
*/

import java.util.Scanner;
class A05
{
	void Accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the hours:");
		int h=sc.nextInt();
		
		System.out.print("Enter the minutes:");
		int m=sc.nextInt();
		
		System.out.print("Enter the seconds:");
		int s=sc.nextInt();

		sc.close();

		Check(h,m,s);
	}
	void Check(int h,int m,int s)
	{
		if(((h<0)||(h>23)) || ((m<0)||(m>59)) || ((s<0)||(s>59)))
		{
			System.out.println("Invalid input");
		}
		else
			Set(h,m,s);
	}
	void Set(int h,int m,int s)
	{
		String mode;
		if(h<12)
			mode="AM";
		else if(h==12)
			mode="PM";
		else
		{
			mode="PM";
			h=h-12;
		}
		System.out.println("Time: "+h+":"+m+":"+s+" "+mode);	
	}
	public static void main(String args[])
	{
		A05 c=new A05();
		c.Accept();	
	}
}	