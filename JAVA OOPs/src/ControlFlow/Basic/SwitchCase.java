package ControlFlow.Basic;

import java.util.Scanner;

public class SwitchCase {

    /**
     * Class Name : SwitchCase
     * Description : function that declares an integer parameter and returns a string
     * Author : Vinayak Sengupta
     */

    public static String dateofMonth(int Date){

        String suffix;

        switch( Date ) {

            case 1: case 21: case 31:
                suffix = "st";
                break;
            case 2: case 22:
                suffix = "nd";
                break;
            case 3: case 23:
                suffix = "rd";
                break;
            default:
                suffix = "th";
                break;

        }

        return( "It’s the " + Date + suffix + " day of the month!" );
    }

    public static void main(String[]args){

        /**
         *
         * @param args
         * The main function that prompts the user to enter a day of the month. Print the number with the
         * appropriate suffix.
         */

        Scanner sc = new Scanner(System.in);

        int finalformat;

        System.out.println("Enter Date: ");
        finalformat = sc.nextInt();

        String dateformat = dateofMonth(finalformat);

        System.out.println(dateformat);

    }// end of main
}// end of class