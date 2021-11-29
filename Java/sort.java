/*WAP in java that sorts half of elements in ascending order and rest
half of the elements in descending order*/

import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of array elements: ");
        int i,j,n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: "); 
        for (i=0; i<n; i++)
            arr[i] = sc.nextInt();
        for (i=0; i<n/2; i++) 
        {
            for (j=0; j<n/2-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        for (i=n/2; i<n; i++) 
        {
            for (j=n/2; j<n-i+n/2-1; j++)
            {
                if (arr[j] < arr[j+1])
                {
                    arr[j]+=arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
        System.out.println("The array elements after sorting: ");   
        display(arr,n);
        sc.close();
    }
    public static void display(int arr[],int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}