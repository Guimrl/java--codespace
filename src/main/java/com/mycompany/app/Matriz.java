package com.mycompany.app;

import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] sortedNums = new int[9];
        Random rand = new Random();

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                int number;
                do {
                    number = rand.nextInt(9) + 1;
                } while (existOnArray(number, sortedNums));

                matriz[line][column] = number;
                sortedNums[line * 3 + column] = number;
            }
        }

        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(matriz[line][column] + " ");
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
