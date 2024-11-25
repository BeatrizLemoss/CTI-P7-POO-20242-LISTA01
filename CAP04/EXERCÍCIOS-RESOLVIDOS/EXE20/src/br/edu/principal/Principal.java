package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  int cod_prod, cod_pais;
	        double peso_quilos, peso_gramas, pre_total, pre_grama, imposto, valor_total;

	        System.out.println("Digite o código do produto (1 a 10): ");
	        cod_prod = scanner.nextInt();
	        System.out.println("Digite o peso do produto em quilos: ");
	        peso_quilos = scanner.nextDouble();
	        System.out.println("Digite o código do país de origem (1 a 3): ");
	        cod_pais = scanner.nextInt();

	        peso_gramas = peso_quilos * 1000;
	        System.out.println("Peso em gramas: " + peso_gramas);

	        if (cod_prod >= 1 && cod_prod <= 4) {
	            pre_grama = 10;
	        } 
	        else if (cod_prod >= 5 && cod_prod <= 7) {
	            pre_grama = 25;
	        } 
	        else {
	            pre_grama = 35;
	        }
	  
	        pre_total = peso_gramas * pre_grama;
	        System.out.println("Preço total (sem imposto): R$ " + pre_total);
	 
	        if (cod_pais == 1) {
	            imposto = 0;
	        } 
	        else if (cod_pais == 2) {
	            imposto = pre_total * 0.15;
	        } 
	        else {
	            imposto = pre_total * 0.25;
	        }

	        System.out.println("Imposto: R$ " + imposto);

	        valor_total = pre_total + imposto;
	        System.out.println("Valor total: R$ " + valor_total);
   
	}       
}