package LoopsandArrays.Basic;

import java.util.Scanner;

public class CountingUp {

    /**
     * Class Name : CountingUp
     * Description : In the main method, prompt the user to enter a number and Use a for loop to
     * count from 0 to that number. Print each number.
     *
     * Author : Vinayak Sengupta
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to count up to: ");

        int count = sc.nextInt();

        for (int i = 0; i <= count; i++) {

            System.out.println(i);

        }

        System.out.println("Done");
    }
}