package Recursion.Advanced;

public class Search {

    /**
     * Class Name : Search
     * Description : Creates public static methods that does Linear Search using Loops and Binary Search
     * using recursion
     * Author : Vinayak Sengupta
     */

    public static boolean linearSearch(int[] search, int target){

        /**
         * @param args
         * The method that initiates a linear search method for an input array to find a target
         */

        for (int i = 0; i < search.length; i++){

            if (search[i] == target){

                return true;
            }
        }
        return false;
    }

    private static boolean HelperbinarySearch(int[] search, int small, int big, int target){

        /**
         * @param args
         * The method that initiates a Binary search Helper method for an input array to find a target
         */

        if (big >= small) {

            int mid = small + ((big - small) / 2);

            if (search[mid] == target) {

                return true;

            } else if (search[mid] > target) {

                return HelperbinarySearch(search, small, mid - 1, target);

            } else {

                return HelperbinarySearch(search, mid + 1, big, target);
            }
        }

        return false;
    }

    public static boolean BinarySearch(int[] search, int target){

        /**
         * @param args
         * The method that calls the Binary search Helper method and initiates the
         * Search for an input array to find a target
         */

        int small = 0;
        int big = search.length - 1;
        boolean binsearch = HelperbinarySearch(search, small, big, target);

        return binsearch;
    }// end of main

}// end of class