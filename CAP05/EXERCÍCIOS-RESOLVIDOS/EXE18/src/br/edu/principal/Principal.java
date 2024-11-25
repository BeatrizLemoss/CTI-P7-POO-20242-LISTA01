package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Insira o valor(ou 0 ou número negativo para sair): ");
            double valor= scanner.nextDouble();
            if(valor > 0){
                System.out.println("O número elevado ao quadrado é " + Math.pow(valor,2));
                System.out.println("O número elevado ao cubo é " + valor * valor * valor);
                System.out.println("A raiz quadrada do número é " + Math.sqrt(valor));
                
        }
            else{
                System.out.println("Saindo...");
                break;
            }
        }
     scanner.close();   
    }
}