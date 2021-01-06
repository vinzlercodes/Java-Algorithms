package ControlFlow;

import java.util.Scanner;

public class IfandElseCompactSyntax {

    /**
     * Class Name : IfandElseCompactSyntax
     * Description : function that declares two float parameters: on for a charge, and one for the payment
     *               the inputs are then subtracted and the dollar and cents are printed according to the
     *               generated change values
     * Author : Vinayak Sengupta
     */

    public static String Change(float pay, float cost){

        float change = pay - cost;

        int integer = (int) change;

        float decimal = change - integer;

        String Cent = decimal > 0.1 ? "Cents" : "Cent";

        String Dollar = decimal > 1 ? "Dollars" : "Dollar";

        String finale = "The Change due is: ";

        finale = finale  + integer + " " + Dollar + " and " + decimal + " " + Cent;

        return finale;


    }

    public static void main(String[]args){

        /**
         *
         * @param args
         * The main prompts the user to enter the charge and the payment. Prints the change.
         */

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Total Cost: ");

        float cost = sc.nextFloat();

        System.out.println("Enter the Amount Paid: ");

        float pay = sc.nextFloat();

        String change = Change(pay, cost);

        System.out.println(change);

    }// end of main

}// end of class
