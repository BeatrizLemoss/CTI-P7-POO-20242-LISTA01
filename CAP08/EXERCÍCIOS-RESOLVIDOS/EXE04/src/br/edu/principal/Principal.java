package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de segundos: ");
        int seg = scanner.nextInt();

        transformacao(seg);
    }

    public static void transformacao(int segundos) {
        int h = segundos / 3600;
        int r = segundos % 3600;
        int m = r / 60;
        int s = r % 60;

        System.out.println("Horas: " + h + ", Minutos: " + m + ", Segundos: " + s);
    }
}
