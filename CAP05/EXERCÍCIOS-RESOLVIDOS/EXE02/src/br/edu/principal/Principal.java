package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int n = 5;
        double e = 1.0;

        for (int i = 1; i <= n; i++) {
            double fat = 1.0;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1.0 / fat;
        }

        System.out.printf("O valor de E é: " + e);
    }
}