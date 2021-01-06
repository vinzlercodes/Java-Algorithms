package ControlFlow;

import java.util.Scanner;

public class IfandElse {

    /**
     * Class Name : IfandElse
     * Description : main method that prompts the user to enter an integer and calls your other method to print a
     *               message if the number is even or odd or divisible by 5
     * Author : Vinayak Sengupta
     */

    public static void isEven(int value){

        int remainder = value % 2;

        if (value % 5 == 0){

            System.out.println("the number is divisible by 5");
        }

        else if (remainder == 0){

            System.out.println("the number is even");
        }

        else{

            System.out.println("the number is odd");
        }
    }

    public static void main(String[]args){

        /**
         *
         * @param args
         * The main method asks the user for a number to check. Then this string is sent
         * to the function that checks is number is even or odd or divisible by 5.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");

        int number = sc.nextInt();

        isEven(number);
    }// end of main
}// end of class

