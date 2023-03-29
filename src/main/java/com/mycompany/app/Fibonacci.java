package com.mycompany.app;

import java.util.Scanner;

/*
 * Write a program that looks up the approximate number of the Fibonacci sequence based on user input.
 */
public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1, c;
        
        System.out.println("Enter the number you want to find: ");
        int n = scan.nextInt();
        for (int i = 0; a < n; i++) {
        
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        scan.close();
    }
}
