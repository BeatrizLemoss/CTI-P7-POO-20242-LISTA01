package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double ang = 30;
        double alt = 5;
        double radiano;
        double escada;
        double seno;
        

        radiano = ang * 3.14 / 180; 
        seno = radiano;
        
        escada = alt / seno;
        
        escada = (int)(escada * 100 + 0.5) / 100.0;
        
        System.out.println("O comprimento da escada é de: " + escada + " metros");
	}

}
