package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[] X = new int[10];
	        int[] Y = new int[10];
	        int[] U = new int[20];
	        int contU = 0;

	        System.out.println("Digite 10 números para o vetor X:");
	        for (int i = 0; i < 10; i++) {
	            X[i] = scanner.nextInt();
	        }

	        System.out.println("Digite 10 números para o vetor Y:");
	        for (int i = 0; i < 10; i++) {
	            Y[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            if (!existeNoVetor(U, contU, X[i])) {
	                U[contU++] = X[i];
	            }
	        }

	        for (int i = 0; i < 10; i++) {
	            if (!existeNoVetor(U, contU, Y[i])) {
	                U[contU++] = Y[i];
	            }
	        }

	        System.out.println("União de X e Y (sem repetições):");
	        for (int i = 0; i < contU; i++) {
	            System.out.print(U[i] + " ");
	        }
	    }

	    public static boolean existeNoVetor(int[] vetor, int tamanho, int elemento) {
	        for (int i = 0; i < tamanho; i++) {
	            if (vetor[i] == elemento) {
	                return true;
	            }
	        }
	        return false;
	}

}
