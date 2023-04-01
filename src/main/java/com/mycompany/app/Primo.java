package com.mycompany.app;

/*
 * Create an algorithm that finds the last prime number less than 500 and displays the sequence numbers
 * fibonacci within that range (1 to prime number found).      
 */
public class Primo {
    public static void main(String[] args) {
        int limite = 500;
        int ultimoPrimo = 2;
        int penultimoPrimo = 2;

        for (int i = 3; i < limite; i++) {
            boolean ehPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                penultimoPrimo = ultimoPrimo;
                ultimoPrimo = i;
            }
        }

        System.out.println("O último número primo menor que 500 é: " + ultimoPrimo);
        System.out.println("Os números da sequência Fibonacci dentro do intervalo [1, " + ultimoPrimo + "] são:");
        
        int a = 1;
        int b = 1;

        while (a <= ultimoPrimo) {

            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
