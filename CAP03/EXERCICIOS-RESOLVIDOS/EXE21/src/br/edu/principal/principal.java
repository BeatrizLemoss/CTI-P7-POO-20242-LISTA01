package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double Y;
		double X = 3.0;
		double Z = 4.0;
		
		Y = Z * Z - X * X;
		if (Y >= 0) {
		Y = Math.sqrt(Y);
		}else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
            Y = 0; 
        }		
		
		System.out.print("A distância que a escada tem que ficar da parede é: "  + Y);		

	}

}
