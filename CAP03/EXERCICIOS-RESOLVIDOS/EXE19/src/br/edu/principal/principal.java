package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double a_degrau = 0.2;
		double a_usuario = 1.5;
		int qtd_degraus; 
		        
		qtd_degraus = (int) (a_usuario / a_degrau); 
		        

		if (a_usuario % a_degrau != 0) {
		            qtd_degraus += 1; 
		        }

		        System.out.println("Quantidade de degraus que o usuário deverá subir: " + qtd_degraus);

	}

}
