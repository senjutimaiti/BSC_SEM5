import java.util.Scanner;
public class SortAscending {    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();          
        int [] arr = new int [n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < n; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
           
        for (int i = 0; i < n-1; i++) 
        {     
            for (int j = 0; j < n-1-i; j++) 
            {     
               if(arr[j] > arr[j+1]) 
               {    
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];    
               }     
            }     
        }    
          
        System.out.println();    

        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    