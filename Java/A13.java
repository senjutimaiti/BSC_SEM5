import java.util.*;
class Divide 
{  
   
    void equalParts(String str, int n)
    {  
        int len = str.length();  
        int temp=0,chars = len/n;  
       
        String equalStr[] = new String[n];  
         
        if(len % n != 0) 
        {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else 
        {  
            for(int i = 0; i < len; i = i+chars)
            {  
               
                String part = str.substring(i, i+chars);  
                equalStr[temp++] = part;    
            }  
            System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < n; i++)
            {  
                System.out.println(equalStr[i]);  
            }  
        }  
    }  
} 
class A13
{
   public static void main(String[] args)
   {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String str = sc.next();

        System.out.println("Enter number of parts in which the String is to be divided");
        int n = sc.nextInt();

        sc.close();

        Divide ob = new Divide();
        ob.equalParts(str,n);

   }
}