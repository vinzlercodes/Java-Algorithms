package LoopsandArrays.Basic;

import java.util.Scanner;

public class FillinganArray {

    /**
     * Class Name : FillinganArray
     * Description : Use a loop to fill the array with multiples of 10 beginning with 0 in an Array
     *
     * Author : Vinayak Sengupta
     */


    public static int[] Fill(int array) {

        int[] arr = new int[array];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = i * 10;

        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size: ");

        int array = sc.nextInt();

        int[] arr = Fill(array);

        //Filling Array Method 1
        for (int index = 0; index < arr.length; index++) {

            System.out.println(arr[index]);

        }

        //Filling Array Method 2 (For Each Loop)
        for (int val : arr) {

            System.out.println(val);
        }

    }
}