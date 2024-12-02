package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static double calculo_S(int N) {
        double fatorial = 1;
        double S = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i; 
            S += 1.0 / fatorial;
        }
        return S;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Insira o valor de N: ");
            int N = scanner.nextInt();
            if (N > 0) {
                System.out.println("O valor de S é " + calculo_S(N));
            } else {
                System.out.println("Insira um valor positivo! ");
            }

            System.out.println("Deseja continuar? (Digite 0 para sair)");
            int continuar = scanner.nextInt();
            if (continuar == 0) {
                break;
            }
        }
        scanner.close();
    }
}
