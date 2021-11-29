//Write a program which will take a number and find out the factors of that number.
import java.util.Scanner;
class A03
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		sc.close();
		if(n<=0)
		{
			System.out.println("Invalid input");
			return;
		}
		else{
			System.out.println("The factors are:\n");
			for(i=1; i<=n; i++)
			{
				if(n%i==0)
					System.out.print(i+" ");
			}
		}
	}		
}	