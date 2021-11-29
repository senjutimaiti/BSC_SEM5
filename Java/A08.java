import java.util.*;  
class pattern
{  
    void pattern1(int rows)  
    {  
        int i, j;       
        for (i= 0; i<= rows-1; i++)  
        {  
            for (j=0; j<=i; j++)   
            {  
                System.out.print("*"+ " ");  
            }   
            System.out.println("");   
        }   
        for (i=rows-1; i>=0; i--)  
        {  
            for(j=0; j <= i-1;j++)  
            {  
                System.out.print("*"+ " ");  
            }  
            System.out.println("");  
        }  
    }  
}

public class A08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of rows you want to print: ");  
        int rows = sc.nextInt();   
        sc.close();  
        if(rows<1)
            System.out.println("Invalid input");
        else{
            pattern ob = new pattern();
            ob.pattern1(rows);
        }
    }
}