package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero, soma = 0, maior = 0, impares = 0, pares = 0, media_pares = 0, menor =0, soma_pares = 0;
        int qtd = 0;
        System.out.println("Insira o número");
        numero = scanner.nextDouble();
        while(numero != 30000){
            soma += numero;
            if(qtd == 0){
                maior = numero;
                menor = numero;
                
            }
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
            qtd += 1;
            if(numero % 2 == 0){
                soma_pares += numero;
                pares += 1;
            }
            else if(numero % 2 != 0){
                impares += 1;
            }
            System.out.println("Insira o número");
            numero = scanner.nextDouble();
            
        }
        if(qtd == 0){
            System.out.println("Nenhum número foi digitado");
        }
        else{
            double porcentagem = (impares/ qtd) * 100;
            if (pares > 0) {
                media_pares = soma_pares / pares;
            }
            System.out.println("A soma dos números digitados é " + soma);
            System.out.println("A quantidade de números digitados é " + qtd);
            System.out.println("O maior número digitado é " + maior + " e o menor é " + menor);
            System.out.println("A pprcentagem de números impares é " + porcentagem);
            if(pares > 0){
                System.out.println("A média dos números pares é " + media_pares);
            }
            else{
                System.out.println("Não foram digitados números pares");
            }
                }
        scanner.close();
    }
}