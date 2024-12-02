package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int[] num = new int[9];
		int cont, i, j;
		for (i = 0; i < 9; i++) {

		}
		for (i = 0; i < 9; i++) {
		    cont = 0;
		    for (j = 1; j <= num[i]; j++) {
		        if (num[i] % j == 0) {
		            cont++;
		        }
		    }
		    if (cont == 2) {

		        System.out.println(num[i] + " está na posição " + (i + 1));
		    }
		}

	}

}
