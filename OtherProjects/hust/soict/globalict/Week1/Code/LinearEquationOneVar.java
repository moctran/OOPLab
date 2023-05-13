package Week1;
import java.util.*;
public class LinearEquationOneVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        while (a == 0)
        {
            System.out.println("INVALID");
            a = sc.nextDouble();
        }
        double b = sc.nextDouble();
        System.out.println("The answer the the equation is x = " + (-b/a));
    }
}
