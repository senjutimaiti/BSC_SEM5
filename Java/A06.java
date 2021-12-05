//Frequency of a number of an given array.
import java.util.*;
 
class Frequency
{
   void countFreq()
   {
        System.out.println("Enter the length of the array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid input!");
        }
        else
        {
            int [] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }  
            int [] fr = new int [arr.length];  
            int visited = -1;  
            for(int i = 0; i < arr.length; i++)
            {  
                int count = 1;  
                for(int j = i+1; j < arr.length; j++)
                {  
                    if(arr[i] == arr[j])
                    {  
                        count++; 
                        fr[j] = visited;  
                    }  
                }  
                if(fr[i] != visited)  
                    fr[i] = count;  
            }  
            System.out.println(" Element | Frequency");    
            for(int i = 0; i < fr.length; i++)
            {  
                if(fr[i] != visited)  
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);  
            }  
        }
        sc.close(); 
    }
} 
class A06
{
    public static void main(String []args)
    {
        Frequency ob = new Frequency();
        ob.countFreq();
    }
}