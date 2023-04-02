package com.mycompany.app;

public class BreakAString {
    
    public static void main(String[] args) {
        String txt = "Esta string será quebrada Teste";
        int tamanho = 5;
        int total = (int) Math.ceil((double) txt.length() / tamanho);

        for (int i = 0; i < total; i++) {
            int inicio = i * tamanho;
            int fim = Math.min(inicio + tamanho, txt.length());
            String pedaco = txt.substring(inicio, fim);
            System.out.println(pedaco);
        }
    }
}
