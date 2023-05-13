package Week1;
import java.util.*;
import java.lang.*;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        while (a == 0)
        {
            System.out.println("INVALID value of a");
            a = sc.nextDouble();
        }
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if (delta == 0)
        {
            System.out.println("The equation produces a double root: " + -b/(2*a));
        }
        else if (delta < 0)
        {
            System.out.println("The equation has no solutions");
        }
        else {
            System.out.println("The first root is: " + (-b-Math.sqrt(delta))/(2*a));
            System.out.println("The second root is: " + (-b+Math.sqrt(delta))/(2*a));
        }
    }
}
