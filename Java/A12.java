import java.util.Scanner;

class IMatrix
{
    void isId()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of the square matrix");
        int d = sc.nextInt();
        int matrix[][] = new int[d][d];
        System.out.println("Enter the matrix");
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        boolean isIdentity = true;
        for(int i=0;i<d;i++)
        {
            if(matrix[i][i]!=1)
            {
                isIdentity = false;
            }
        }

        if(isIdentity)
        {
            for(int i=0;i<d;i++)
            {
                for(int j=0;j<d;j++)
                {
                    if(i!=j && matrix[i][j]!=0)
                    {
                        isIdentity = false;
                    }
                }
            }
        }

        if(isIdentity)
        {
            System.out.println("This is an Identity matrix");
        }
        else
        {
            System.out.println("This is not an Identity matrix");
        }
    }
}

public class A12
{
    public static void main(String[] args)
    {
        IMatrix ob=new IMatrix();
        ob.isId();
    }
}  
