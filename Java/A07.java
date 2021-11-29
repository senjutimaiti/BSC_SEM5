import java.util.*;
class genPalindrome
{
    int low, high;

    genPalindrome(int l, int h)
    {
        this.low=l;
        this.high=h;
    }
    
    void findPalindrome()
    {
        for (int i = low; i <= high; i++) {
            int r=0, sum=0;
            int temp=i;    
            while(temp>0){    
                r=temp%10;  //getting remainder  
                sum=(sum*10)+r;    
                temp=temp/10;    
            }    
            if(i==sum)    
                System.out.println(i + " ");    
                
        }
    }
}

public class A07
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter lower limit");
        int l=sc.nextInt();
        
        System.out.println("Enter upper limit");
        int u=sc.nextInt();

        sc.close();

        if( l>u || u<0 || l<0)
        {
            System.out.println("Wrong input");
        }
        else
        {
           genPalindrome ob = new genPalindrome(l,u);
           System.out.println("Palindrome number in given range: ");
           ob.findPalindrome();
        }
    }
}