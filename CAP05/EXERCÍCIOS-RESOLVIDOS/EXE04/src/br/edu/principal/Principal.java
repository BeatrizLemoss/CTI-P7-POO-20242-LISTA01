package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int numTermos = 5;
        double X = 2.0;
        double resultado = 0.0;

        for (int i = 1; i <= numTermos; i++) {
            int fatorial = 1;
            double potencia = 1.0;

            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }

            for (int k = 1; k <= i; k++) {
                potencia *= X;
            }

            if (i % 2 == 0) {
                resultado -= potencia / fatorial;
            } else {
                resultado += potencia / fatorial;
            }
        }

        System.out.printf("O valor da série é: " + resultado);
    }
}