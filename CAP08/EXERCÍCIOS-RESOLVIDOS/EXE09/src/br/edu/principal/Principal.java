package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void maior_menor(Scanner scanner){
        int maior =0, menor =0;
        for(int i =0; i < 5; i ++){
            System.out.println("Insira o número " + (i + 1));
            int N = scanner.nextInt();
            if(i ==0){
                maior = N;
                menor = N;
            }
            else{
                if(maior < N){
                    maior = N;
                }
                if(menor > N){
                    menor = N;
                }
            }
        }
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        maior_menor(scanner);
        scanner.close();
    }
}