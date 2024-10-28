package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		  double salario = 1000;
	        double imposto = salario * (0.07);
	        double grat = salario * 0.05;
	        double receber_salario = salario + grat - imposto;
	        System.out.println("O salário a receber é " + receber_salario);

	}

}
