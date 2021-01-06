package ControlFlow.Advanced;

import java.util.Scanner;

public class AgeandExpressions {

    /**
     * Class Name : AgeandExpressions
     * Description : program that asks the user for their age, then uses the given table to decide how to respond
     * Author : Vinayak Sengupta
     */

    public static void Age(int exp){

        if (exp < 10){

            System.out.println("Is this your first program?");
        }

        else if (exp < 13){

            System.out.println("A tween!");
        }

        else if (exp < 20){

            System.out.println("A teen!");
        }

        else if (exp < 30){

            System.out.println("A twenty-something!");
        }

        else{

            System.out.println("With age comes experience.");
        }
    }

    public static void main(String[]args){


        /**
         *
         * @param args
         * The main prompts the user to enter the age and returns this value to the above functions
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");

        int number = sc.nextInt();

        Age(number);
    }// end of main
}// end of class


