package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem lidos: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um número inteiro positivo: ");
            int num = scanner.nextInt();

            int fatorial = 1;
            for (int j = 1; j <= num; j++) {
                fatorial *= j;
            }

            System.out.printf("Número: " + num + " Fatorial: " +  fatorial);
            System.out.println("");
        }

        scanner.close();
    }
}