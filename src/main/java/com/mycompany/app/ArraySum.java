package com.mycompany.app;

/*
 * Having an array $a = [21, 4, 78, 54, 74, 65, 85, 45, 7, 125], write a code that
 *  sums the result of the sum of each element multiplied by its index. 
 * Ex.: 21*0 + 4*1+ 78*2....
 * The code should work for any array passed in, regardless of its size.
*/
public class ArraySum {

    public static void main(String[] args) {
        int[] a = { 21, 4, 78, 54, 74, 65, 85, 45, 7, 125 };
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * i;
        }

        System.out.println("O resultado da soma de cada elemento multiplicado pelo respectivo indice é: " + sum);
    }
}
