package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int n = 8;
        int a = 0, b = 1;

        System.out.print("Os primeiros " + n + " termos da sequência de Fibonacci são: ");
        
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
    }
}