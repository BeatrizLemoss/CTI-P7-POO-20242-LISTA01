package br.edu.principal;

public class principal {

	public static void main(String[] args) {
	double custo = 500;
		double convite = 10;
		double qtd;
		qtd = Math.ceil(custo / convite);
		System.out.print("quantidade de convites necessários: "+ (int)qtd );

	}

}
