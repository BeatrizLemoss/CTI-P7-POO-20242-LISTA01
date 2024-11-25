package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 double pre, venda, novo_pre;

	        System.out.println("Digite o preço atual do produto: ");
	        pre = scanner.nextDouble();
	        System.out.println("Digite a venda média mensal do produto: ");
	        venda = scanner.nextDouble();

	    
	        if (venda < 500) {
	            novo_pre = pre + (10 / 100.0 * pre); 
	        } 
	        else if (pre < 30) {
	            novo_pre = pre + (10 / 100.0 * pre); 
	        } 
	        else if (venda >= 500 && venda < 1200) {
	            novo_pre = pre + (15 / 100.0 * pre);  
	        } 
	        else if (pre >= 30 && pre < 80) {
	            novo_pre = pre + (15 / 100.0 * pre);  
	        } 
	        else if (venda >= 1200) {
	            novo_pre = pre - (20 / 100.0 * pre);  
	        } 
	        else if (pre >= 80) {
	            novo_pre = pre - (20 / 100.0 * pre);  
	        }
	        else {
	            novo_pre = pre;  
	        }

	       
	        System.out.println("O novo preço do produto é: " + novo_pre);
	    
	
        
	}
	        
}