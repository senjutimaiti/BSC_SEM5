import java.util.*;

class SortList 
{
    void sorting()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = sc.nextInt();          
        String [] arr = new String [n];
        
        System.out.println("Enter the list of names");

        sc.nextLine();
        for (int i = 0; i < n; i++) 
        {   
            arr[i] = sc.nextLine();
        }
          
        sc.close(); 
        String temp;
        for (int i = 0; i < n-1; i++) 
        {     
            for (int j = 0; j < n-1-i; j++) 
            {     
               if(arr[j].compareToIgnoreCase(arr[j+1])>0) 
               {    
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;    
               }     
            }     
        } 

        System.out.println("The list of names in sorted order: ");
        for (int i = 0; i < n; i++) 
        {   
            System.out.println(arr[i]);
        }
    }
}

public class A15
{
    public static void main(String[] args)
    {
        SortList ob = new SortList();
        ob.sorting();
    }
}