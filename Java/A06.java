//Frequency of a number of an given array.
import java.util.*;
 
class Frequency
{
   void countFreq(int arr[], int n)
   {
        boolean visited[] = new boolean[n];
        
        Arrays.fill(visited, false);
    
    
        for (int i = 0; i < n; i++) {
    
            
            if (visited[i] == true)
                continue;
    
            
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ": " + count);
        }
   }
} 
class A06
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      Frequency ob = new Frequency();
      System.out.println("Enter number of elements");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter array elements");
      for(int i=0 ; i < n ; i++){
           arr[i]=sc.nextInt();
        }
       System.out.println("Frequency of each element: ");
       ob.countFreq(arr, n);
       sc.close();
    }
}