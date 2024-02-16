// SANGOGADE AYOMIDE EPHRAIM
// 223322
// Level 200
// Group PIE

import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first coefficient: ");
        double a = input.nextDouble();

        System.out.print("Enter second coefficient: ");
        double b = input.nextDouble();

        System.out.print("Enter third coefficient: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - 4*a*c;

        if (discriminant > 0){
            double firstRoot = (-b + Math.sqrt(discriminant))/(2*a);
            double secondRoot = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The roots of the quadratic equation are "+firstRoot+" and "+secondRoot);
        }
        else if (discriminant == 0){
            double firstRoot = b/(2*a);
            double secondRoot = -b/(2*a);
            System.out.println("The roots of the quadratic equation are "+firstRoot+" and "+secondRoot);
        }
        else{
            System.out.println("The quadratic equation does not have any real root");
        }
        input.close();
    }
}