package Recursion.Advanced;

public class Range {

    /**
     * Class Name : Range
     * Description : Creates public static methods that creates varied dimensionally ranged arrays
     * Author : Vinayak Sengupta
     */

    public static int[] makeRange(int m, int n, int k) {

        /**
         * @param args
         * The main method that returns an array of integers with values in the range of m to n.
         * The k parameter indicates the step between values in the array.
         */

        int capacity = ((n - m) / k) + 1;

        int[] make = new int[capacity];


        for (int i = 0; i < capacity; i++) {

            make[i] = m;

            m = m + k;
        }

        return make;
    }

    public static int[] makeRange(int m, int n) {

        /**
         * @param args
         * The main method that returns a convenience method that calls your other makeRange method with k=1
         */


        int[] the = makeRange(m, n, 1);
        return the;

    }

    public static int[] makeRange(int n) {

        /**
         * @param args
         * The main method that returns a convenience method that calls
         * your other makeRange method with m=0 and k=1.
         */

        int[] range = makeRange(0, n, 1);

        return range;

    }// end of method
}// end of class