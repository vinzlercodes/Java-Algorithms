package ExpressionsAndCalculations;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        /*
         The method takes in 2 numbers (integer or floating point) as user input
         and computes their addition, subtraction, multiplication and division
         */

        float x, y, sum, diff, mult, div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        x = sc.nextFloat();

        System.out.println("Enter Second Number: ");
        y = sc.nextFloat();

        sc.close();
        sum = x + y;
        diff = x - y;
        mult = x * y;
        div = x / y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sum of these numbers: "+ sum);
        System.out.println("Difference of these numbers: "+ diff);
        System.out.println("Product of these numbers: "+ mult);
        System.out.println("Division of these numbers: "+ div);
    }// end of main method
}// end of class