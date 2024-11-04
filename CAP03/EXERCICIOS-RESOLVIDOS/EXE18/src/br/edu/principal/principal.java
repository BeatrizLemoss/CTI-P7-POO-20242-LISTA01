package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		
			
		 
			        double peso_saco = 5.0; 
			        double racao_gato1 = 200.0/1000; 
			        double racao_gato2 = 250.0/1000;
			        
			        double racaoTotal = 5 * (racao_gato1+ racao_gato2);
			        double total_final = peso_saco - racaoTotal;
			        
			   
			        System.out.printf("A quantidade de ração restante é: " + total_final + " kg");
	        

	}

}
