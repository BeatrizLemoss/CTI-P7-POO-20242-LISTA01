package br.edu.principal;

public class principal {

	public static void main(String[] args) {
	double hora = 2.30; 
        int h = (int) hora; 
        double minutos = (hora - h) * 100; 

 
        if (minutos >= 60) {
            h += (int) minutos / 60; 
            minutos = minutos % 60; 
        }

        int conversao = (h * 60) + (int) minutos;  

        System.out.println(h + " horas e " + (int) minutos + " minutos equivalem a " + conversao + " minutos.");


	}

}
