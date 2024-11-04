package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double vlr_sal = 2000;
		double vlr_kw;
		double qtd_kw = 30;
		double vlr_reais;
		double desc;
		double vlr_desc;
		
		vlr_kw = vlr_sal / 5;        
		vlr_reais = vlr_kw * qtd_kw; 
		desc = vlr_reais * 0.15; 
		vlr_desc = vlr_reais - desc; 
		
		System.out.println("O valor quilowatt é: " + vlr_kw);
		System.out.println("valor a ser pago: " + vlr_reais);
		System.out.println("valor com disconto :" + vlr_desc);

	}

}
