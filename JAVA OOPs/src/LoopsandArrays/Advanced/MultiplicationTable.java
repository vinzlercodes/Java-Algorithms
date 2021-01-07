package LoopsandArrays.Advanced;

public class MultiplicationTable {

    /**
     * Class Name : MultiplicationTable
     * Description : Create a 10x10 two dimensional array.
     *
     * Author : Vinayak Sengupta
     */

    public static void main(String[] args) {

        int[][] table = new int[10][10];

        for (int row = 0; row < table.length; row++) {

            int[] rows = table[row];

            for (int column = 0; column < rows.length; column++) {

                table[row][column] = (row + 1) * (column + 1);
            }
        }

        for (int[] row : table) {

            for (int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}