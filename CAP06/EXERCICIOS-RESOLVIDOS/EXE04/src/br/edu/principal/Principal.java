package edu.br.principal;

public class principal {

	public static void main(String[] args) {
		
		int[] num = {5, -2, 8, -4, 7, -1, 0, 3};
		int[] pos = new int[8];
		int[] neg = new int[8];
		int contP = 0, contN = 0;

		for (int i = 0; i < 8; i++) {
		    if (num[i] >= 0) {
		        if (contP < 8) {
		            pos[contP] = num[i];
		            contP++;
		        }
		    } else {
		        if (contN < 8) {
		            neg[contN] = num[i];
		            contN++;
		        }
		    }
		}

		if (contN == 0) {
		    System.out.println("Vetor de negativos vazio");
		} else {
		    System.out.println("Vetor de negativos:");
		    for (int i = 0; i < contN; i++) {
		        System.out.print(neg[i] + " ");
		    }
		    System.out.println();
		}

		if (contP == 0) {
		    System.out.println("Vetor de positivos vazio");
		} else {
		    System.out.println("Vetor de positivos:");
		    for (int i = 0; i < contP; i++) {
		        System.out.print(pos[i] + " ");
		    }
		    System.out.println();
		}


	}

}
