package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static int minutos(int hora_inicio, int min_inicio, int hora_final, int min_final ) {
        if(min_final < min_inicio) {
            min_final += 60;
            hora_final -= 1;
        }
        
        if(hora_final < hora_inicio) {
            hora_final += 24;
        }
        
        int tot_m = min_final - min_inicio;
        int tot_h = hora_final - hora_inicio;
        
        int total = tot_h * 60 + tot_m;
        
        return total;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o valor da hora de início: ");
        int hora_inicio = scanner.nextInt();
        
        System.out.println("Insira o valor dos minutos de início: ");
        int min_inicio = scanner.nextInt();
        
        System.out.println("Insira o valor da hora final: ");
        int hora_final = scanner.nextInt();
        
        System.out.println("Insira o valor dos minutos finais: ");
        int min_final = scanner.nextInt();
        
        int resultado = minutos(hora_inicio, min_inicio, hora_final, min_final);
        System.out.println("A duração do jogo em minutos é: " + resultado);
        scanner.close();
    }
}