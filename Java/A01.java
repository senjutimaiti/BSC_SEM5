//Write a program which will take a range and find the prime numbers between that range. (Using DIS class)
import java.io.*;
class A01
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream ob = new DataInputStream(System.in);
		System.out.println("Enter the lower and upper range respectively: ");
		String str=ob.readLine();
		int i=Integer.parseInt(str);
		str=ob.readLine();
		int n=Integer.parseInt(str);
		if(i>=n)
			System.out.println("Invalid range");
		else if(n<2)
			System.out.println("No prime numbers exist");
		else
		{
			if(i<2)
				i=2;
			System.out.println("The prime numbers are:");
			for(; i<=n; i++)
			{
				if(isPrime(i))
					System.out.println(i+" ");
			}
		}
	}
	static boolean isPrime(int i)
	{
		boolean a = true;
		for(int j=2; j<=i/2; j++)
		{
			if(i%j==0)
			{
				a=false;
				break;
			}
		}
		return a;
	}
}