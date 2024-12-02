package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		int[] vet1 = {3, 5, 4, 3, 2, 5, 3, 2, 5, 9};
		int[] vet2 = {4, 5, 6, 7, 8, 4, 55, 23, 8, 6};
		int[] vet3 = new int[20];
		int j = 0;

		for (int i = 0; i < 10; i++) {
		    vet3[j] = vet1[i];
		    j++;
		    vet3[j] = vet2[i];
		    j++;
		}

		for (int i = 0; i < 20; i++) {
		    System.out.print(vet3[i] + " ");
		}


	}

}
