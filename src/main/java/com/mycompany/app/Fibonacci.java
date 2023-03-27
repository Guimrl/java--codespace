package com.mycompany.app;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner scan = new Scanner(System.in);
        //TODO: terminar o input amanha
        int n = scan.nextInt();
            for (int i = 0; a < n; i++) {
        
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
           
        }
    }
}
