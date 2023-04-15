package Week1;
import java.util.*;
import java.lang.*;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum1 = sc.nextLine();
        String strNum2 = sc.nextLine();
        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        System.out.println("Sum of the 2 numbers: " + (a+b));
        System.out.println("Difference of the 2 numbers: " + Math.abs(a-b));
        System.out.println("Product of the 2 numbers: " + (a*b));
        if (a == 0)
            System.out.println("Quotient of the two numbers (a/b): 0");
        else if (b == 0)
            System.out.println("Quotient of the two numbers (b/a): 0");
        else if (a != 0 && b != 0)
        {
            System.out.println("Quotient of the two numbers (a/b): " + (a/b));
            System.out.println("Quotient of the two numbers (b/a): " + (b/a));
        }
    }
}
