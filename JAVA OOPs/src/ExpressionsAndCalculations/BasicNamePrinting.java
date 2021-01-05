package ExpressionsAndCalculations;

public class BasicNamePrinting {

    public static void Pet(){

        // the method defines the name of a pet dog letter by letter

        System.out.println('B');
        System.out.println('U');
        System.out.println('B');
        System.out.println('B');
        System.out.println('L');
        System.out.println('E');
        System.out.println('S');

    }// end of method

    public static void main(String[]args){

        /*
           the main method calls the above function 2 times
           printing out the pet's name letter by letter 2 times
         */

        Pet();
        System.out.println("***************************************");
        Pet();
    }//end of main

}// end of class
