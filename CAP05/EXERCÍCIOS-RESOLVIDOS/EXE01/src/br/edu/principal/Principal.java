package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int anoAtual = 2024;
        double salarioInicial = 1000.0;
        double percentual = 1.5 / 100;
        double novoSalario = salarioInicial + (percentual * salarioInicial);
        
        for (int ano = 2007; ano <= anoAtual; ano++) {
            percentual *= 2;
            novoSalario += novoSalario * percentual;
        }
        
        System.out.println("O salário atual do funcionário é: R$ " + novoSalario);
    }
}