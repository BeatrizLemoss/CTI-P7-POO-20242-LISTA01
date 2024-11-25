package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        final double salarioMinimo = 450.00;

        int codigos;
        double horasTrabalhadas;
        char turnos;
        char categorias;

        for (int i = 0; i < 10; i++) {
            codigos = 101 + i;

            if (i == 0) {
                horasTrabalhadas = 160;
                turnos = 'M';
                categorias = 'O';
            } else if (i == 1) {
                horasTrabalhadas = 150;
                turnos = 'N';
                categorias = 'G';
            } else if (i == 2) {
                horasTrabalhadas = 170;
                turnos = 'V';
                categorias = 'O';
            } else if (i == 3) {
                horasTrabalhadas = 180;
                turnos = 'M';
                categorias = 'G';
            } else if (i == 4) {
                horasTrabalhadas = 160;
                turnos = 'N';
                categorias = 'O';
            } else if (i == 5) {
                horasTrabalhadas = 155;
                turnos = 'M';
                categorias = 'G';
            } else if (i == 6) {
                horasTrabalhadas = 165;
                turnos = 'V';
                categorias = 'O';
            } else if (i == 7) {
                horasTrabalhadas = 175;
                turnos = 'N';
                categorias = 'G';
            } else if (i == 8) {
                horasTrabalhadas = 160;
                turnos = 'M';
                categorias = 'O';
            } else {
                horasTrabalhadas = 150;
                turnos = 'V';
                categorias = 'G';
            }

            double valorHora = 0;
            if (categorias == 'G') {
                if (turnos == 'N') {
                    valorHora = salarioMinimo * 0.18;
                } else {
                    valorHora = salarioMinimo * 0.15;
                }
            } else if (categorias == 'O') {
                if (turnos == 'N') {
                    valorHora = salarioMinimo * 0.13;
                } else {
                    valorHora = salarioMinimo * 0.10;
                }
            }

            double salarioInicial = valorHora * horasTrabalhadas;

            double auxilioAlimentacao;
            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 0.20;
            } else if (salarioInicial <= 600) {
                auxilioAlimentacao = salarioInicial * 0.15;
            } else {
                auxilioAlimentacao = salarioInicial * 0.05;
            }

            double salarioFinal = salarioInicial + auxilioAlimentacao;

            System.out.println("Código: " + codigos);
            System.out.println("Número de horas trabalhadas: " + horasTrabalhadas);
            System.out.println("Valor da hora trabalhada: R$ " + valorHora);
            System.out.println("Salário inicial: R$ " + salarioInicial);
            System.out.println("Auxílio alimentação: R$ "+ auxilioAlimentacao);
            System.out.println("Salário final: R$ " + salarioFinal);
            System.out.println("");
        }
    }
}
