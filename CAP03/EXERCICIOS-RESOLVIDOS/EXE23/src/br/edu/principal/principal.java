package br.edu.principal;

public class principal {

	public static void main(String[] args) {
	double num = 5.75;
		int inteiro = (int) num;
		double fracionario = num - inteiro;
		System.out.println("A parte inteira é: " + inteiro);
		System.out.println("A parte fracionária é: " + fracionario);
		System.out.println("O arredondamento do número é: " + Math.round(num));

	}

}
