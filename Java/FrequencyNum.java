import java.util.Scanner;
class FrequencyNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid input");
			return;
		}
		else
		{		
			int arr[]=new int[n];
			int i,f=0;
			System.out.println("Enter the array elements:");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Enter the element whose frequency is to be found:");
			int num=sc.nextInt();
			for(i=0;i<n;i++)
			{
				if(arr[i]==num)
					f++;
			}
			System.out.print("The frequency of "+num+" = "+f);
		}
		sc.close();
	}
}