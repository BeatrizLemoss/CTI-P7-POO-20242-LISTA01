package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoAntigo, precoAtual, acrescimo;

        System.out.print("Digite o preço antigo do produto: ");
        precoAntigo = scanner.nextDouble();

        System.out.print("Digite o preço atual do produto: ");
        precoAtual = scanner.nextDouble();

        acrescimo = calculoReajuste(precoAntigo, precoAtual);

        System.out.printf("O percentual de acréscimo foi:  ", acrescimo);
    }

    public static double calculoReajuste(double precoAntigo, double precoAtual) {
        return ((precoAtual - precoAntigo) / precoAntigo) * 100;
    }
}
