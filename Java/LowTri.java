import java.util.Scanner;

class LowTri{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimention of the square matrix");
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
        System.out.println("The lower triangular matrix is");
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d;j++)
            {
                if(j>i)
                {
                    System.out.print("  ");
                }
                else{
                    System.out.print(matrix[i][j]+"  ");
                }
            }
            System.out.print("\n");
        }
    }
}
