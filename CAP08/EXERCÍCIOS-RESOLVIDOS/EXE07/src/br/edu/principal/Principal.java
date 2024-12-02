package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static double medias(double nota1, double nota2, double nota3, String letra){
        double media = 0;
        
        if(letra.equalsIgnoreCase("A")) {
            media = (nota1 + nota2 + nota3) / 3;
        }
        else if(letra.equalsIgnoreCase("P")) {
            double somaPesos = 5 + 3 + 2;
            double somaNotas = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
            media = somaNotas / somaPesos;
        }
        
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Insira a nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Insira a nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.println("Insira a nota 3: ");
            double nota3 = scanner.nextDouble();
            
            System.out.println("Insira a Letra 'A' para média aritmética, 'P' para média ponderada, ou 'S' para sair: ");
            String letra = scanner.next();
            
            if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("P")) {
                double resultado = medias(nota1, nota2, nota3, letra);
                System.out.println("A média é: " + resultado);
            } 
            else if(letra.equalsIgnoreCase("S")) {
                System.out.println("Saindo...");
                break;
            } 
            else {
                System.out.println("Insira uma letra válida ('A', 'P', ou 'S').");
            }
        }

        scanner.close();
    }
}
