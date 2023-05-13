package Week1;
import java.util.*;
public class SystemOfLinearEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble(),
                a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();
        double det = a11 * a22 - a12 * a21;
        if (det == 0)
        {
            if (b1 / a11 == b2 / a21) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }
        else {
            double det1 = b1*a22 - b2*a12;
            double det2 = a11*b2 - a21*b1;
            System.out.printf("The system has two solutions: " + det1/det + " and " + det2/det);
        }
    }
}
