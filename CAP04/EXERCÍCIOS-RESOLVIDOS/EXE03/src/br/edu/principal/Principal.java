package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 4.2;

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}

