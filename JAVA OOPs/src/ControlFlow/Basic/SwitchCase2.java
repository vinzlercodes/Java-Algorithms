package ControlFlow.Basic;

import java.util.Scanner;

public class SwitchCase2 {

    /**
     * Class Name : SwitchCase2
     * Description : function that, given an integer parameter returns a String that is the name of the day
     * Author : Vinayak Sengupta
     */

    public static void dayofWeek(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 0-6:");

        int number = sc.nextInt();

        switch(number){
            case 0:
                System.out.print("It is Monday");
                break;
            case 1:
                System.out.print("It is Tuesday");
                break;
            case 2:
                System.out.print("It is Wednesday");
                break;
            case 3:
                System.out.print("It is Thursday");
                break;
            case 4:
                System.out.print("It is Friday");
                break;
            case 5:
                System.out.print("It is Saturday");
                break;
            case 6:
                System.out.print("It is Sunday");
                break;
            default:
                System.out.print("Invalid Number and Day");
                break;

        }
    }

    public static void main(String[]args){

        /**
         *
         * @param args
         * main method that prompts the user to enter a number and prints a message with the corresponding day.
         */

        dayofWeek();

    }// end of main
}// end of class
