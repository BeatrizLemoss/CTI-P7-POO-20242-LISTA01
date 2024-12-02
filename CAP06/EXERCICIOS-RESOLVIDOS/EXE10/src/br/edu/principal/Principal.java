package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		 String[] gabarito = new String[8];
	        String[] respostaAluno = new String[8];
	        int[] alunos = new int[10];
	        int tot_aprovados = 0;

	        System.out.print("Digite o gabarito da prova (8 respostas separadas por espaço): ");
	        for (int i = 0; i < 8; i++) {
	            gabarito[i] = scanner.next();
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número do " + (i + 1) + "º aluno: ");
	            alunos[i] = scanner.nextInt();

	            System.out.print("Digite as respostas do aluno " + alunos[i] + " (8 respostas separadas por espaço): ");
	            int pontos = 0;
	            for (int j = 0; j < 8; j++) {
	                respostaAluno[j] = scanner.next();
	                if (respostaAluno[j].equalsIgnoreCase(gabarito[j])) {
	                    pontos++;
	                }
	            }

	            System.out.println("A nota do aluno " + alunos[i] + " foi: " + pontos);

	            if (pontos >= 6) {
	                tot_aprovados++;
	            }
	        }

	        double perc_aprovados = (tot_aprovados * 100.0) / 10;
	        System.out.println("O percentual de alunos aprovados é: " + perc_aprovados + "%");		         
	}

}
