package ExpressionsAndCalculationsWithUserInput.Advanced;

import java.util.Scanner;

public class UserInputandCalculation2 {

    public static void main(String[]args) {

        /*
        A simple method that takes user input of mass in grams
        converts the mass in kilograms to maintain SI unit compatibility
        and finally applied einstein's relativity theory equation of E=MC^2
        and calculates the Energy output in Joules
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Input Mass in grams: ");
        Double Mass = input.nextDouble();

        int c = (3 * 100_000_000);

        float Energy = (float) ((Mass/1000) * c * c);
        System.out.println(Mass + " grams in Mass " + "equals to: " + Energy + " Joules of Energy, According to E=MC^2");
    }// end of main method
}// end of class