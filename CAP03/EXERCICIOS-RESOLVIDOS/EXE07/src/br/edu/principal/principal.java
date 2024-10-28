package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double salario = 1000;
        double imposto = salario * 0.10;
        double salario_receber = salario + 50 - imposto;
        System.out.println("O salário a receber é de " + salario_receber);

	}

}
