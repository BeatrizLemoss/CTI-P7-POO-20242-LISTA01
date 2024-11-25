package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

	
		        System.out.println("Digite o horário inicial:");
		        System.out.print("Hora: ");
		        int hora_i = scanner.nextInt();
		        System.out.print("Minuto: ");
		        int min_i = scanner.nextInt();


		        System.out.println("Digite o horário final:");
		        System.out.print("Hora: ");
		        int hora_f = scanner.nextInt();
		        System.out.print("Minuto: ");
		        int min_f = scanner.nextInt();


		        if (min_i > min_f) {
		            min_f += 60;
		            hora_f -= 1;
		        }


		        if (hora_i > hora_f) {
		            hora_f += 24;
		        }


		        int min_d = min_f - min_i;
		        int hora_d = hora_f - hora_i;


		        System.out.println("O jogo durou " + hora_d + " hora(s) e " + min_d + " minuto(s)");

		        scanner.close();
		    }
		}