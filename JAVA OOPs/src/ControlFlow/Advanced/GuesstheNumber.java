package ControlFlow.Advanced;

import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {

    /**
     * Class Name : GuesstheNumber
     * Description : method that, given a number and a guess, prints a message that says
     *               “Too high!”, “Too low!”, or “Correct!” based on the
     *               random number generate and the user guess
     * Author : Vinayak Sengupta
     */



    public static boolean Guess(int secret, int guess) {

        if (secret == guess) {

            System.out.println("Correct!”");
            return true;

        }

        else if (secret < guess) {

            System.out.println("Too high!”");
            return false;
        }

        else if (secret > guess) {

            System.out.println("Too low!”");
            return false;
        }

        else {

            System.out.println("Error");
            return false;

        }
    }

    public static void main(String[] args) {


        /**
         *
         * main method that generates a pseudorandom number between 1 and 10
         * and gives the user up to 3 guesses to guess the number
         */

        Random random = new Random();

        boolean solution = false;

        int secretNumber = random.nextInt(11);

        Scanner a = new Scanner(System.in);

        System.out.println("Try to guess a number between 0 - 10");

        System.out.println("Enter 1st Guess: ");

        int guess1 = a.nextInt();

        solution = Guess(secretNumber, guess1);

        if (solution == true){

            System.out.println("Guessing done");
            System.exit(0);

        }

        Scanner b = new Scanner(System.in);

        int guess2 = b.nextInt();

        solution = Guess(secretNumber, guess2);

        if (solution == true){

            System.out.println("Guessing done");
            System.exit(0);

        }

        Scanner c = new Scanner(System.in);

        int guess3 = c.nextInt();

        solution = Guess(secretNumber, guess3);

        if (solution == true){

            System.out.println("Guessing done");
            System.exit(0);

        }

    }// end of main
}// end of class

