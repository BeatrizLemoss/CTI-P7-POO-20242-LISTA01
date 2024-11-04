package br.edu.principal;

public class principal {

	public static void main(String[] args) {
	double hora = 2.30; 
        int h = (int) hora; 
        double minutos = (hora - h) * 100; // Cálculo dos minutos

        // Ajuste para garantir que minutos não sejam maiores que 59
        if (minutos >= 60) {
            h += (int) minutos / 60; 
            minutos = minutos % 60; 
        }

        // Conversão total em minutos
        int conversao = (h * 60) + (int) minutos;  

        // Saída formatada
        System.out.println(h + " horas e " + (int) minutos + " minutos equivalem a " + conversao + " minutos.");


	}

}
