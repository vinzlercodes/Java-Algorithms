package Recursion.Basic;

import java.util.*;

public class Factorials {

    /**
     * Class Name : Factorials
     * Description : Function that calculates the factorial for any positive N value
     * Author : Vinayak Sengupta
     */

    public static int factorial(int n){

        if  (n == 0){

            return 1;

        }

        else if (n == 1){

            return 1;

        }

        else{

            return n * factorial(n - 1);
        }
    }

    public static void main(String[]args){

        /**
         * @param args
         * The main method asks the user for an integer.
         * Then this integer is sent to the function that calculates its factorial.
         */

        System.out.println("Enter the number for factorial: ");

        Scanner sc = new Scanner(System.in);

        int fact = sc.nextInt();

        System.out.println(factorial(fact));
    }// end of main
}// end of class
