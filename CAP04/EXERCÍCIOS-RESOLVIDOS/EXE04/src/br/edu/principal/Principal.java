package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		 double num1 = 8.5;
	        double num2 = 4.2;
	        double num3 = 6.1;

	        if (num1 < num2 && num1 < num3) {
	            if (num2 < num3) {
	                System.out.println("A ordem crescente é: " + num1 + " - " + num2 + " - " + num3);
	            } else {
	                System.out.println("A ordem crescente é: " + num1 + " - " + num3 + " - " + num2);
	            }
	        } else if (num2 < num1 && num2 < num3) {
	            if (num1 < num3) {
	                System.out.println("A ordem crescente é: " + num2 + " - " + num1 + " - " + num3);
	            } else {
	                System.out.println("A ordem crescente é: " + num2 + " - " + num3 + " - " + num1);
	            }
	        } else if (num3 < num1 && num3 < num2) {
	            if (num1 < num2) {
	                System.out.println("A ordem crescente é: " + num3 + " - " + num1 + " - " + num2);
	            } else {
	                System.out.println("A ordem crescente é: " + num3 + " - " + num2 + " - " + num1);
	            }
	        }
	    }
}