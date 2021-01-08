package Recursion.Advanced;

import java.util.*;

public class Main {

    /**
     * Class Name : Main
     * Description : Class that references all the the 2 other classes of Range and Search and utilises their methods
     *               to create a user defined array and implement Linear and Binary Search and compare exec times
     * Author : Vinayak Sengupta
     */


    public static void main(String[] args) {

        /**
         * @param args
         * The main method that calls the Range and Search Class, methods and utilises their methods
         * to create a user defined array and implement Linear and Binary Search and compare their
         * execution times
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter beginning value: ");

        int first = sc.nextInt();

        System.out.println("Enter final value: ");

        int last = sc.nextInt();

        System.out.println("Enter the iteration value: ");

        int iter = sc.nextInt();

        int[] sol = Range.makeRange(first, last, iter);

        int length = sol.length;

        System.out.println("Length of created Aarray is: " + length);

        do {

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Enter the Target to search for in the array: ");

            System.out.println("To Exit the Menu type any Negative Number");

            int target = sc1.nextInt();

            if (target < 0) {

                break;
            }

            long beglinearsearchtime = System.nanoTime();

            boolean linsearch = Search.linearSearch(sol, target);

            long endlinearsearchtime = System.nanoTime();

            long Finallinearsearchtime = endlinearsearchtime - beglinearsearchtime;

            double Finalltime = Finallinearsearchtime * 10e-6;

            if (linsearch) {

                System.out.println("Target found using Linear Search");

                System.out.println("Time in which Target was found using Linear Search Method: " + Finalltime + "milliseconds");

            } else {

                System.out.println("Target cannot be found using Linear Search");
            }

            long begbinarysearchtime = System.nanoTime();

            boolean binsearch = Search.BinarySearch(sol, target);

            long endbinarysearchtime = System.nanoTime();

            long Finalbinarysearchtime = endbinarysearchtime - begbinarysearchtime;

            double Finalbtime = Finalbinarysearchtime * 10e-6;

            System.out.println("*******************************************************************");

            if (binsearch) {

                System.out.println("Target found using Binary Search");

                System.out.println("Time in which Target was found using Binary Search Method: " + Finalbtime + "milliseconds");

            } else {

                System.out.println("Target cannot be found using Binary Search");

            }

        } while (true);
    }// end of main
}// end of class
