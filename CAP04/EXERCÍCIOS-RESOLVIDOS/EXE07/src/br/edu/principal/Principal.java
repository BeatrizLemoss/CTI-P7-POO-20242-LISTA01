package br.edu.principal;

public class Principal{

	public static void main(String[] args) {

	
		        double A = 5.0;
		        double B = 3.0;
		        double C = 8.0;
		        int I = 1;

		        if (I == 1) {
		            if (A < B && A < C) {
		                if (B < C) {
		                    System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
		                }
		            } else if (B < A && B < C) {
		                if (A < C) {
		                    System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
		                }
		            } else {
		                if (A < B) {
		                    System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
		                }
		            }
		        } else if (I == 2) {
		            if (A > B && A > C) {
		                if (B > C) {
		                    System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
		                }
		            } else if (B > A && B > C) {
		                if (A > C) {
		                    System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
		                }
		            } else {
		                if (A > B) {
		                    System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
		                }
		            }
		        } else if (I == 3) {
		            if (A > B && A > C) {
		                System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
		            } else if (B > A && B > C) {
		                System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
		            } else {
		                System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
		            }
		        }
	}
}
