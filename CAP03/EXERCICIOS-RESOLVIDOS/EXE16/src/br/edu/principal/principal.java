package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double horas_t = 8;
		double salario = 1500;
		
		double valor_hora_t = salario / 2;
		double salario_b = valor_hora_t * horas_t;
		double imposto = salario_b * 0.03;
		double salario_final = salario_b - imposto;
		System.out.println("O valor da hora trabalhada é: " + valor_hora_t);
        System.out.println("O valor do salário bruto é: " + salario_b);
        System.out.println("O valor do imposto é: " + imposto);
        System.out.println("O valor do salário final é: " + salario_final);
	}

}
