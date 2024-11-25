package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor positivo de X: ");
        double x = scanner.nextDouble();

        double s = 0.0;
        int fatorial = 1;
        int expoente = 2;
        int fatorialControle = 1;
        int direcaoFatorial = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= fatorialControle; j++) {
                fatorial *= j;
            }

            double termo = Math.pow(x, expoente) / fatorial;
            if (i % 2 == 0) {
                s += termo;
            } else {
                s -= termo;
            }

            if (direcaoFatorial == 1) {
                fatorialControle++;
                if (fatorialControle == 5) {
                    direcaoFatorial = -1;
                }
            } else {
                fatorialControle--;
                if (fatorialControle == 1) {
                    direcaoFatorial = 1;
                }
            }

            expoente++;
            fatorial = 1;
        }

        System.out.printf("O valor da série é: " + s);

        scanner.close();
    }
}