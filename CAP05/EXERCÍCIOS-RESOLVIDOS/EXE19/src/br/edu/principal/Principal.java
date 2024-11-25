package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Insira o valor de m: ");
            int m = scanner.nextInt();
            System.out.print("Insira o valor de n: ");
            int n = scanner.nextInt();
            
            if (m >= n) {
                System.out.println("Saindo....");
                break;
            }
            
            int soma = 0;
            for (int i = m; i <= n; i++) {
                soma += i;
            }
            
            System.out.println("A soma dos números inteiros entre " + m + " e " + n + " é " + soma);
        }
        
        scanner.close();
    }
}
