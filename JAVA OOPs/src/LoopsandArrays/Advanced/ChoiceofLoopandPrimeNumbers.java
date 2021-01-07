package LoopsandArrays.Advanced;

import java.util.Scanner;

public class ChoiceofLoopandPrimeNumbers {

    /**
     * Class Name : ChoiceofLoopandPrimeNumbers
     * Description : Computes the Prime Numbers taking user Input and also with your choice of the Loop method
     *
     * Author : Vinayak Sengupta
     */


    public static boolean For(int Primenumber) {

        if (Primenumber == 1){

            return false;
        }

        if (Primenumber == 2){

            return true;
        }

        if(Primenumber % 2 == 0){

            return false;
        }

        for (int i = 3; i <= ((Primenumber)/2); i += 2){

            if (Primenumber % i == 0){

                return false;
            }
        }

        return true;

    }

    public static boolean While(int Primenumber){

        if (Primenumber == 1 ){

            return false;
        }

        if (Primenumber == 2){

            return true;
        }
        if(Primenumber % 2 == 0){

            return false;
        }

        int i = 3;

        while (i <= (Primenumber)/2){

            if (Primenumber % i == 0){

                return false;
            }

            i += 2;
        }

        return true;
    }

    public static boolean DoWhile(int Primenumber) {

        if (Primenumber == 1){

            return false;
        }

        if (Primenumber == 2){

            return true;
        }
        if(Primenumber % 2 == 0){

            return false;
        }

        int j = 3;

        do{
            if(Primenumber % j == 0){

                return false;
            }

            j += 2;

        }
        while(j <= (Primenumber) / 2);

        return true;

    }

    public static void main(String[] args){

        /**
         *
         * The main method asks the user for number input
         * Then computes n prime numbers with the desired loop
         *
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("f For for loop");

        System.out.println("w For while loop");

        System.out.println("d for do-while loop");

        System.out.print("Please Enter the Number for prime number and letter for the loop: ");

        String type = sc.next();

        int lengthofinput = type.length();

        String number =  type.substring(0, lengthofinput - 1);

        int num = Integer.parseInt(number);

        if(num == 0){
            System.exit(0);
        }
        char choice = type.charAt(lengthofinput - 1);

        boolean Prime = false;

        long start = 0L;

        long end = 0L;

        //primecount is optional

        int count = 0;

        int PrimeCount = 1;

        switch(choice){

            case 'f':
                start = System.currentTimeMillis();

                for(int i = 1; i <= (num*num + 1); i++){

                    Prime = For(i);

                    if(Prime){

                        System.out.println("Prime number "+ PrimeCount + " : " + i);
                        count++;
                        PrimeCount++;
                    }
                    if(count == num){
                        break;
                    }
                }
                end = System.currentTimeMillis();
                break;

            case'w':

                start = System.currentTimeMillis();
                for(int i = 1; i <= (num*num + 1); i++){
                    Prime = While(i);

                    if(Prime){

                        System.out.println("Prime number "+ PrimeCount + " : " + i);
                        count++;
                        PrimeCount++;

                    }

                    if(count == num){
                        break;
                    }
                }

                end = System.currentTimeMillis();
                break;

            case 'd':
                start = System.currentTimeMillis();

                for(int i = 1; i <= (num*num + 1); i++) {

                    Prime = DoWhile(i);

                    if(Prime){

                        System.out.println("Prime number "+ PrimeCount + " : " + i);
                        count++;
                        PrimeCount++;
                    }
                    if(count == num){
                        break;
                    }
                }
                end = System.currentTimeMillis();
                break;

            default:
                System.out.println("Invalid option");

        }

        long difference = end - start;
        System.out.println("The time taken to run the " + choice + " loop is : "+ difference +" milliseconds");

    } //End of main.
} //End of class Prime
