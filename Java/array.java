import java.util.Scanner;

public class array 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int min = a[i][0];
            for (int j = 0; j < n; j++) {
                min = Math.min(min, a[i][j]);
            }

            System.out.println((i + 1) + " row min is " + min);
        }

        for (int i = 0; i < n; i++) {
            int min = a[0][i];
            for (int j = 0; j < n; j++) {
                min = Math.min(min, a[j][i]);
            }

            System.out.println((i + 1) + " col min is " + min);
        }
    }
}