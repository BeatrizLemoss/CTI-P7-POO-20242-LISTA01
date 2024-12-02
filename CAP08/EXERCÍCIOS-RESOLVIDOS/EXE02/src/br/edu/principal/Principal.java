package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (positivo): ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número (positivo): ");
        int num2 = scanner.nextInt();

        if (num1 >= 0 && num2 >= 0) {
            int soma = somar(num1, num2);
            System.out.println("Soma dos números inteiros entre " + num1 + " e " + num2 + ": " + soma);
        } else {
            System.out.println("Por favor, insira números positivos.");
        }
    }

    public static int somar(int num1, int num2) {
        int soma = 0;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1 + 1; i < num2; i++) {
            soma += i;
        }

        return soma;
    }
}
