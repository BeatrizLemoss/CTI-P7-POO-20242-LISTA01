package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, result;

        do {
            System.out.print("Digite um valor para 'a' (maior que 1): ");
            a = scanner.nextInt();
        } while (a <= 1);

        System.out.print("Digite o valor de 'b': ");
        b = scanner.nextInt();

        System.out.print("Digite o valor de 'c': ");
        c = scanner.nextInt();

        result = divisores(a, b, c);

        System.out.println("Soma dos inteiros = " + result);
    }

    public static int divisores(int a, int b, int c) {
        int soma = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
