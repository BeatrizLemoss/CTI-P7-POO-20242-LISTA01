package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor_inicial, juros = 0, valor_parc, total, valor_juros, num_parc = 1;

        System.out.println("Escreva o valor inicial da dívida: ");
        valor_inicial = scanner.nextDouble();

        
        valor_juros = valor_inicial * juros / 100;
        total = valor_inicial + valor_juros;
        valor_parc = total / num_parc;

        System.out.println("Valor da Dívida:  " + total);
        System.out.println("Valor dos Juros: " + valor_juros);
        System.out.println("Quantidade de Parcelas: " + num_parc);
        System.out.println("Valor da Parcela: " + String.format("%.2f", valor_parc));
        System.out.println();

        juros += 10;
        num_parc += 2;

        for (int i = 1; i <= 4; i++) {
            valor_juros = valor_inicial * juros / 100;
            total = valor_inicial + valor_juros;
            valor_parc = total / num_parc;

            System.out.println("Valor da Dívida:" + total);
            System.out.println("Valor dos Juros:" + valor_juros);
            System.out.println("Quantidade de Parcelas: " + num_parc);
            System.out.println("Valor da Parcela: " + valor_parc);
            System.out.println();

            juros += 5;
            num_parc += 3;
        }

        scanner.close();
    }
}