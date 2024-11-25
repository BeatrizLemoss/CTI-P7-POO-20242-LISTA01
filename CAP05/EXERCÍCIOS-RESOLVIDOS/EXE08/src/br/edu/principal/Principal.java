package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int numTermos = 14;
        int termoAtual = 2; 
        int termoAnterior = 7;

        System.out.print("Os primeiros " + numTermos + " termos da sequência são: ");
        System.out.print(termoAtual + " " + termoAnterior + " ");

        for (int i = 3; i <= numTermos; i++) {
            if (i % 2 == 0) {
                termoAtual /= 2;
            } else {
                termoAtual = termoAnterior * 3;
            }

            System.out.print(termoAtual + " ");
            termoAnterior = termoAtual;
        }
    }
}
