package Week1;
import java.util.*;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = 0;
        while (n > 0)
        {
            for (int i = 1; i < n; i++)
                System.out.print(" ");
            for (int k = 0; k <= q; k ++)
                System.out.print("*");
            n--;
            q+=2;
            System.out.print("\n");
        }
    }
}
