package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double origem, preco_unitario, valor_transporte = 0;
        double total_imposto = 0, imposto = 0, seguro = 0;
        String transporte, carga;

        while (true) {
            System.out.println("Insira o valor do preço unitário: ");
            preco_unitario = scanner.nextDouble();

            if (preco_unitario <= 0) {
                System.out.println("Preço inválido. Saindo...");
                break;
            }

            System.out.println("País de origem: ");
            System.out.println("1- EUA, 2- México, 3 - Outros");
            origem = scanner.nextDouble();

            System.out.println("Insira o meio de transporte: ");
            System.out.println("T- Terrestre, F- Fluvial, A- Áereo ");
            transporte = scanner.next();

            System.out.println("A carga é perigosa? S -Sim, N- Não");
            carga = scanner.next();

            if (preco_unitario <= 100) {
                imposto = preco_unitario * 0.05;
            } else {
                imposto = preco_unitario * 0.10;
            }

            if (carga.equalsIgnoreCase("S")) {
                if (origem == 1) {
                    valor_transporte = 50;
                } else if (origem == 2) {
                    valor_transporte = 21;
                } else if (origem == 3) {
                    valor_transporte = 24;
                }
            } else if (carga.equalsIgnoreCase("N")) {
                if (origem == 1) {
                    valor_transporte = 12;
                } else if (origem == 2) {
                    valor_transporte = 21;
                } else if (origem == 3) {
                    valor_transporte = 60;
                }
            }

            if (transporte.equalsIgnoreCase("A") || origem == 2) {
                seguro = preco_unitario / 2;
            } else {
                seguro = 0;
            }

            double preco_final = preco_unitario + imposto + valor_transporte + seguro;
            total_imposto += imposto;

            System.out.println("O valor do imposto é " + imposto + " reais");
            System.out.println("O valor do transporte é " + valor_transporte + " reais");
            System.out.println("O valor do seguro é " + seguro + " reais");
            System.out.println("O valor do preço final é " + preco_final + " reais");
            System.out.println();
        }

        System.out.println("O total dos impostos é " + total_imposto + " reais");
    }
}
       
        