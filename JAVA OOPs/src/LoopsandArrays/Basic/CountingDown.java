package LoopsandArrays.Basic;

import java.util.Scanner;

public class CountingDown {

    /**
     * Class Name : CountingDown
     * Description : prompt the user to enter a number and Use a while loop to count down from that
     * number to 0. Print each number
     *
     * Author : Vinayak Sengupta
     */

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to countdown from: ");

        int count = sc.nextInt();

        while (count >= 0){

            System.out.println(count);

            count = count - 1;
        }

        System.out.println("Done");

    }
}

