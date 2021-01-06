package ExpressionsAndCalculationsWithUserInput.Advanced;

import java.util.Scanner;

public class UserInputandCalculation1 {

    public static void main(String[]args) {

        /*
         A simple method that takes user input of temperature in Fahrenheit
         and then calculates its Kelvin degree equivalent using the conversion expression:
         Kelvin = 5/9 * (Fahrenheit - 32) + 273
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Input temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float kelvin = ((5 * (fahrenheit - 32))/9 + 273);
        System.out.println(fahrenheit + " degrees Fahrenheit is " + kelvin + " degrees Kelvin");
    }// end of main method
}// end of class
