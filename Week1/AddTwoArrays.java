package Week1;
import java.sql.SQLOutput;
import java.util.*;
public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrices: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();
        }
        int[][] sum = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                sum[i][j] = a[i][j]+b[i][j];
        }
        System.out.println("The sum array: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0 ; j < n; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
}
