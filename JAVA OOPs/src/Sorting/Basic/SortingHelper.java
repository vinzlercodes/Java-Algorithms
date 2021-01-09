package Sorting.Basic;

import java.util.Random;

public class SortingHelper {

    /**
     * Class Name : SortingHelper
     * Description : The class consists the various helper methods that are
     * crucial towards the main function of the sort algorithms
     * Author : Vinayak Sengupta
     */

    private static final Random RNG = new Random();

    public static boolean sorted(int[] array) {

        /**
         * @function
         * The function is for checking if an array is sorted or not in ascending order
         */

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i - 1]) {

                return false;
            }
        }

        return true;
    }

    public static void swap(int[] array, int a, int b) {

        /**
         * @function
         * The helper function is for the insertion and bubble sort algorithms.
         * It is for swapping 2 elements positions in an array
         */
        //store value at temp var at index
        int value = array[a];
        //copy value into a from b
        array[a] = array[b];
        //copy temp var into b
        array[b] = value;

    }

    public static int[] makeArray(int size) {

        /**
         * @function
         * The helper function is for all the sort algorithms.
         * It is for creating a random array which is the input for the sort algorithms
         */

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {

            array[i] = RNG.nextInt(size);

        }

        return array;
    }

    public static int[][] divide(int[] array) {

        /**
         * @function
         * The helper function is for the merge sort algorithms. This divides the array based on the even and odd
         * indexing and continues recursively dividing it by the mid point of each sub array.
         */

        int[] odd = new int[array.length / 2];

        int[] even = new int[array.length - odd.length];

        int oddIndex = 0;

        int evenIndex = 0;

        int i;

        for (i = 0; i < array.length; i++) {

            if (i % 2 == 0) {

                even[evenIndex] = array[i];

                evenIndex++;

            } else {

                odd[oddIndex] = array[i];

                oddIndex++;

            }
        }

        int[][] combined = new int[2][];

        combined[0] = even;

        combined[1] = odd;

        return combined;

    }

    public static int[] merge(int[] a, int[] b) {

        /**
         * @function
         * The helper function is the second part of the merge function, where after having the divided the array
         * to the end of its length, each value is sorted in ascending order and recursively merged back.
         */

        if (a.length == 0) {

            return b;

        } else if (b.length == 0) {

            return a;

        }

        int[] merged = new int[a.length + b.length];

        int i = 0; //for position in a array

        int j = 0; //for position in b array

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {

                merged[i + j] = a[i];

                i++;

            } else {

                merged[i + j] = b[j];

                j++;

            }
        }

        if (i < a.length) {

            System.arraycopy(a, i, merged, i + j, a.length - i);

        } else if (j < b.length) {

            System.arraycopy(b, j, merged, i + j, b.length - j);
        }

        return merged;
    }

    public static int[] cat(int[] ... arrays){

        /**
         * @function
         * The helper function is for the quick sort, where after the division of the 3 arrays,
         * they are concatenated back for analysis
         */

        int length = 0;

        int size = 0;

        for (int[] array : arrays){

            length++;

        }

        for (int[] array : arrays){

            size = size + array.length;

        }

        int[] Concat = new int[size];

        int index = 0;

        for (int[] array: arrays){

            System.arraycopy(array, 0, Concat, index, array.length);

            index = index + array.length;
        }

        return Concat;
    }

}// end of class