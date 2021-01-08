package Recursion.Basic;

import java.util.Scanner;

public class FibonacciSeries {

    /**
     * Class Name : FibonacciSeries
     * Description : Function that calculates the fibonacci series value for any N number
     * Author : Vinayak Sengupta
     */

    public static int fibonacci(int n) {

        if (n <= 1) { //

            return n;

        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[]args){

        /**
         * @param args
         * The main method asks the user for an integer.
         * Then this integer is sent to the function that calculates its fibonacci series value.
         */

        System.out.println("Enter the number for fibonacci: ");

        Scanner sc = new Scanner(System.in);

        int fib = sc.nextInt();

        for (int i = 0; i <= fib - 1; i++){

            System.out.println("fib(" + i + ") = " + fibonacci(i));
        }

    }// end of main
}// end of class