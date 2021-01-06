package ControlFlow.Advanced;

import java.util.Scanner;

public class MovieAndMusicOpinion {

    /**
     * Class Name : MovieAndMusicOpinion
     * Description : Write a program that first asks the user to enter 1
     *               if they want to discuss music or2 to discuss movies
     *               and then further discuss opinions on the music bands and movies
     * Author : Vinayak Sengupta
     */

    public static void Age(int exp) {

        if (exp == 1) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Do you like Fall-Out-Boys?, That's my favourite Band! ");

            System.out.println("1 = Yes or 2 = No");

            int choice = scan.nextInt();

            if (choice == 1) {

                System.out.println("Good taste!");

            } else if (choice == 2) {

                System.out.println("There is no accounting for taste!");

            } else {

                System.out.println("Invalid Answer");

            }

        } else if (exp == 2) {

            Scanner scany = new Scanner(System.in);

            System.out.println("which Star Wars Episode was the best? ");

            System.out.println("\n 1 = Ep. 4 or 5" + "\n 2 = Ep. 1,2 or 3" + "\n 3 = Ep. 6 or 7");

            int choice = scany.nextInt();

            if (choice == 1) {

                System.out.println("I agree!");

            } else if (choice == 2) {

                System.out.println("Um, no.");

            } else if (choice == 3) {

                System.out.println("I like those, too!");

            } else {

                System.out.println("Invalid Answer");

            }

        }
    }

    public static void main(String[]args){

        /**
         * @param args
         * The main method asks the user for an option between 1 (music) or 2 (movies).
         * Then this value is carried to the above function and more options are implemented
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want to discuss music or 2 to discuss movies: ");

        int number = sc.nextInt();

        Age(number);
    }// end of main
}// end of class
