//Write a program which will take a range and find the twin prime numbers between that range. (Using Scanner class)
import java.util.*;
public class A02 {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower and upper range respectively: ");
        int i=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		if(i>n)
			System.out.println("Invalid range");
		else if(n<2)
			System.out.println("No prime number exists");
		else
		{
			if(i<2)
				i=2;
			if((n-i)<2)
				System.out.println("No twin primes can exists in this range");
			else
			{
				System.out.println("Twin prime numbers are: ");
				for(; i<=n; i++)
				{
					if(twinPrime(i,i+2))
						System.out.println(i+" "+(i+2));
				}
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
	static boolean twinPrime(int n1, int n2)
	{
		return (isPrime(n1) && isPrime(n2));
	}
}
