package LoopsandArrays.Advanced;

import java.util.Scanner;

public class SieveofEratosthenes {

    /**
     * Class Name : SieveofEratosthenes
     * Description : computes the prime numbers through the Sieve of Eratosthenes methodology
     *
     * Author : Vinayak Sengupta
     */

    public static void sieve(int n)
    {

        boolean prime[] = new boolean[n+1];

        for(int i = 0; i < n; i++) {

            prime[i] = true;
        }

        for(int S = 2; S * S <= n; S++){

            if(prime[S] == true){

                for(int i = S * 2; i <= n; i += S)

                    prime[i] = false;
            }
        }


        for(int i = 2; i <= n; i++){

            if(prime[i] == true)
                System.out.println(i + " ");
        }
    }


    public static void main(String args[])

    /**
     *
     * The main method asks the user for number input
     * Then computes n prime numbers
     *
     */


    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number:");

        int Number = sc.nextInt();

        sieve(Number);

        System.out.println("Following are the prime numbers ");

        System.out.println("smaller than or equal to " + Number);


    }
}