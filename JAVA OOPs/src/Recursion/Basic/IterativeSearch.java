package Recursion.Basic;

public class IterativeSearch {

    /**
     * Class Name : IterativeSearch
     * Description : Function that uses a simple iterative search algorithm to search for an element
     * in an array
     * Author : Vinayak Sengupta
     */

    public static boolean search(int[] arr, int item) {

        for (int i : arr) {

            if (i == item) {
                return true;
            }
        }
        return false;
    }// end of method
}//end of class
