import java.util.Scanner;
class Secondsmallest
{
    void ssmol(int n, int x[])
    {
        int small=x[0];
        for(int i=0; i<n; i++)
        {
            if(x[i]<small)
            {
                small=x[i];
            }
        }
        int sSmall=x[0];
        for(int i=0; i<n; i++)
        {
            if(x[i]<sSmall && x[i]!=small)
            {
                sSmall=x[i];
            }
        }
    
        System.out.println("Second Smallest Number: " + sSmall);
    }
}
public class A10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++ )
        {
            x[i] = sc.nextInt();
        }
        sc.close();

        Secondsmallest ob=new Secondsmallest();
        ob.ssmol(n,x);
    }
}  