package Recursion.Basic;

public class CountUpandDown {

    /**
     * Class Name : CountUpandDown
     * Description : Function that uses recursion to countdown and countup from a N value and
     *               also test stack overflow
     * Author : Vinayak Sengupta
     */


    public static void countDown(int n){ //Count Down - 1

        /**
         * @param args
         * The method uses loop of choice to count down from a value
         */

        for (int i = n; n >= 0; n--){

            System.out.println(n);
        }
    }

    public static void countDownRec(int n){ // Count Down - 2

        /**
         * @param args
         * The method uses recursion to count down from a value
         */

        if(n < 0){

            return;
        }

        else{

            System.out.println(n);

            n = n - 1;

            countDownRec(n);
        }


    }

    public static void countUpRec(int n) { // Count Down - 2

        /**
         * @param args
         * The method uses recursion to count up to a value
         */

        if (n < 0) {

            return;

        }

        else {

            int j = n - 1;

            countUpRec(j);

            System.out.println(n);
        }
    }

    public static void main(String[]args){

        /**
         * @param args
         * The main method that inserts the value int and calls the above functions with input
         */

        System.out.println("The countdown from 10 is: ");
        countDown(10);

        System.out.println();
        countDownRec(10);

        System.out.println();
        countUpRec(10);

        System.out.println();
        countUpRec(200000); // Blow Up the Stack

    }// end of main
}// end of class
