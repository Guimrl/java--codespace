package com.mycompany.app;

import java.util.Random;

/*
 * write a script that draws 9 numbers and places them in a matrix (two-dimensional array) 3x3,
 * taking into account that the numbers cannot be repeated and their neighbors within the array
 * of each line CANNOT be real neighboring numbers.
 * Ex: 
 * [4, 5, 6] where 4 and 5 are direct neighbors.
 */

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[] sortedNums = new int[9];
        Random rand = new Random();

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                int number;
                do {
                    number = rand.nextInt(9) + 1;
                } while (existOnArray(number, sortedNums));

                matrix[line][column] = number;
                sortedNums[line * 3 + column] = number;
            }
        }

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(matrix[line][column] + " ");
            }
            System.out.println();
        }
    }

    public static boolean existOnArray(int number, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

}
