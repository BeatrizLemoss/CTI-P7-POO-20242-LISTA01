package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int aux;

        System.out.println("Digite 5 números para o vetor X:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (X[j] > X[j + 1]) {
                    aux = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = aux;
                }
            }
        }

        System.out.println("Digite 5 números para o vetor Y:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            Y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (Y[j] > Y[j + 1]) {
                    aux = Y[j];
                    Y[j] = Y[j + 1];
                    Y[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            R[i] = X[i];
            R[i + 5] = Y[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (R[j] > R[j + 1]) {
                    aux = R[j];
                    R[j] = R[j + 1];
                    R[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor X ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor Y ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor R (Vetor X e Y unidos e ordenados):");
        for (int i = 0; i < 10; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();



	}

}
