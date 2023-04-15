package Week1;
import java.util.*;
public class NumericArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        System.out.print("The sorted array: ");
        for (int x : arr)
        {
            System.out.print(x + " ");
            sum += 1l*x;
        }
        System.out.print("\n");
        System.out.println("The sum of the array: " + sum);
        System.out.printf("The average value of the array: " + (double)sum/(double)n);
    }
}
