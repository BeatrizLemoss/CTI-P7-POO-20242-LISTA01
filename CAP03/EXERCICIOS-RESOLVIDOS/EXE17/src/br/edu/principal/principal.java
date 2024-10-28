package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double salario = 1250;
		double cheque1 = 22;
		double cheque2 = 54;
		
		double cpmf1;
		double cpmf2;
		
		double saldo;
		
		cpmf1 = cheque1 * 0.38 / 100;
		cpmf2 = cheque2 * 0.38 / 100;
		
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		
		System.out.println("O saldo é igual a: " + saldo);

	}

}
