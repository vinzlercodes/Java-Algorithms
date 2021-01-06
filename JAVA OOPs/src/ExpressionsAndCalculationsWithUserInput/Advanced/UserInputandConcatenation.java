package ExpressionsAndCalculationsWithUserInput.Advanced;

import java.util.Scanner;

public class UserInputandConcatenation {

    public static String concatenation(String a, float b, char c){

        /*
          this method defines a concatenation function that
          that joins the string, number (float or int) and a unique character
         */

        String x = a + b + c;
        return x;
    }// end of method

    public static void main(String[]args){

        /*
          The main method generates a unique username for the user
          the method takes in any string, any number and a unique character from the user
          and concatenates them together to form a unique username string
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String z = sc.nextLine();

        System.out.println("Enter a number: ");
        float f = sc.nextFloat();

        System.out.println("Enter a unique character: ");
        char h = sc.next().charAt(0);

        String concatenated = concatenation(z, f, h);
        System.out.println("Your new username is: " + concatenated);
    }// end of main method
}// end of class
