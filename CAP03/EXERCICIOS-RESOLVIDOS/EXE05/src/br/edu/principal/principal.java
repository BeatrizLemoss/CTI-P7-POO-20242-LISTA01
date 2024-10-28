package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		 double salario = 1000;
	        double percentual = 50;
	        double aumento = salario * (percentual/100);
	        System.out.println("O aumento é " + aumento + " R$");
	        double novo_salario = salario + aumento;
	        System.out.println("O novo salário é " + novo_salario + " R$");

	}

}
