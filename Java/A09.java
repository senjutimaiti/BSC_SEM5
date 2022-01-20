import java.util.Scanner;
class SortAscending 
{    
    void sort() 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();          
        int [] arr = new int [n];
        
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }  
          
        sc.close(); 
        int temp;
        for (int i = 0; i < n-1; i++) 
        {     
            for (int j = 0; j < n-1-i; j++) 
            {     
               if(arr[j] > arr[j+1]) 
               {    
                    temp=arr[j];;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;    
               }     
            }     
        }   

        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
    } 

}
public class A09
{
    public static void main(String[] args)
    {
        SortAscending ob=new SortAscending();
        ob.sort();
    }     
}   