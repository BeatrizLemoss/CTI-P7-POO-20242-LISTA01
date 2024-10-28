package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		  double deposito = 13;
	        double juros = 5;
	        double rendimento = deposito * (juros / 100);
	        double valor_total = deposito + rendimento;
	        System.out.println("O valor do rendimento é " + rendimento);
	        System.out.println("O valor total é " + valor_total);

	}

}
