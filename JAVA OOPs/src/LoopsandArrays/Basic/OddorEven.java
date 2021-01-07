package LoopsandArrays.Basic;

import java.util.Scanner;

public class OddorEven {

    /**
     * Class Name : OddorEven
     * Description : Use a do while loop to:
     *               a. Prompt the user to enter a number.
     *               b. Print a message indicating whether the number is even or odd.
     *
     * Author : Vinayak Sengupta
     */

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        double number;

        do {

            System.out.println("Enter the number to check for odd or even: ");

            number = sc.nextDouble();

            if ((number *10) % 2 == 0) {

                System.out.println("Entered number is Even");

            } else {

                System.out.println("Entered number is Odd");

            }

        } while (number != 0);

        System.out.println("Done");

    }
}
