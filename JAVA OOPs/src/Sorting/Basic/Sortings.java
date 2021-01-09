package Sorting.Basic;

public class Sortings {

    /**
     * Class Name : Sortings
     * Description : The class consists of the 4 sorting algorithm functions
     * Author : Vinayak Sengupta
     */


    public static int[] insertionsort(int[] array) {

        /**
         * @function
         * The function is the algorithm for the insertion sorting method
         */

        int partition = 0;

        while (partition < array.length) {

            int index = partition;

            while (index > 0 && array[index] < array[index - 1]) {

                SortingHelper.swap(array, index, index - 1);

                index--;
            }

            partition++;
        }

        return array;
    }

    public static int[] mergesort(int[] array) {

        /**
         * @function
         * The function is the algorithm for the merge sorting method
         */

        if (array.length < 2) {

            return array;

        }

        int[][] divided = SortingHelper.divide(array);

        int[] evens = divided[0];

        int[] odds = divided[1];

        int[] sortedEvens = mergesort(evens);

        int[] sortedOdds = mergesort(odds);

        int[] merged = SortingHelper.merge(sortedEvens, sortedOdds);

        return merged;

    }

    public static int[] quicksort(int[] array){

        /**
         * @function
         * The function is the algorithm for the quick sorting method
         */

        if(array.length < 2){

            return array;
        }

        int pivot = array[0];

        int lower = 0, greater = 0, equal = 0;

        for(int i=0; i < array.length; i++){

            if(array[i] > pivot){

                greater++;

            }

            else if(array[i] < pivot){

                lower++;

            }

            else{

                equal++;
            }
        }

        int[] lowerarray = new int[lower];

        int[] greaterarray = new int[greater];

        int[] equalarray = new int[equal];

        int l = 0, g = 0, e = 0;

        for(int i = 0; i < array.length; i++) {

            if(array[i] > pivot) {

                greaterarray[g] = array[i]; //storing elements greater than the pivot in the array

                g++; //keeps track of the next open index

            }

            else if(array[i] < pivot){

                lowerarray[l] = array[i];

                l++;
            }

            else{
                equalarray[e] = array[i];

                e++;
            }
        }

        int[] lessthan = quicksort(lowerarray);

        int[] greaterthan = quicksort(greaterarray);

        int[] finalarray = SortingHelper.cat(lessthan, equalarray, greaterthan);

        return finalarray;
    }

    public static int[] bubbleSort(int[] array){

        /**
         * @function
         * The function is the algorithm for the bubble sorting method
         */

        int a = array.length;

        for(int i = 0; i < a; i++) {

            for(int j = 1; j < (a-i); j++) {

                if(array[j - 1] > array[j]) {

                    SortingHelper.swap(array, j-1, j);
                }
            }
        }

        return array;

    }
}// end of class