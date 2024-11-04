package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double ang = 30;
        double alt = 5;
        double radiano;
        double escada;
        double seno;
        

        radiano = ang * Math.PI / 180; 
        seno = Math.sin(radiano);
        
        escada = alt / seno;
        
        escada = Math.round(escada * 100.0) / 100.0;
        
        System.out.println("O comprimento da escada é de: " + escada + " metros");
	}

}
