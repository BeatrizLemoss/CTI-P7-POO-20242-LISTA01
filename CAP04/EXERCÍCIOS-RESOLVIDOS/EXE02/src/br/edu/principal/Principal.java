package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		        double nota1 = 8.5;
		        double nota2 = 4.2;
		        double nota3 = 5.0;
		        double media, notaExame;

		        media = (nota1 + nota2 + nota3) / 3;
		        System.out.printf("Média aritmética: %.2f\n", media);

		        if (media >= 0 && media < 3) {
		            System.out.println("Reprovado");
		        } else if (media >= 3 && media < 7) {
		            System.out.println("Exame");
		            notaExame = 12 - media;
		            System.out.printf("Deve tirar nota %.2f para ser aprovado\n", notaExame);
		        } else if (media >= 7 && media <= 10) {
		            System.out.println("Aprovado");
		        }
						}
}
