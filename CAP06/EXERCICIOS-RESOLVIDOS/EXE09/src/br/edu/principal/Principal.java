package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		  int[] voo = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
	        String[] origem = {"São Paulo", "Rio de Janeiro", "Brasília", "Belo Horizonte", "Curitiba", 
	                           "Porto Alegre", "Recife", "Salvador", "Fortaleza", "Manaus", "Belém", "Natal"};
	        String[] destino = {"Rio de Janeiro", "São Paulo", "Salvador", "Recife", "Porto Alegre", 
	                            "Curitiba", "Brasília", "Manaus", "Fortaleza", "Belém", "Natal", "Belo Horizonte"};
	        int[] lugares = {10, 20, 15, 12, 8, 25, 5, 10, 18, 7, 10, 20};
		 System.out.println("Bem-vindo ao sistema de reserva de passagens!");
	        System.out.println("Lista de voos disponíveis:");
	        for (int i = 0; i < voo.length; i++) {
	            System.out.println("Voo " + voo[i] + " - Origem: " + origem[i] + " - Destino: " + destino[i] + " - Lugares: " + lugares[i]);
	        }

	        int op;
	        do {
	            System.out.println("\nMENU PRINCIPAL");
	            System.out.println("1 - Consultar");
	            System.out.println("2 - Efetuar reserva");
	            System.out.println("3 - Sair");
	            System.out.print("Digite sua opção: ");
	            op = scanner.nextInt();

	            switch (op) {
	                case 1: 
	                    System.out.println("\nCONSULTAR");
	                    System.out.println("1 - Por número do voo");
	                    System.out.println("2 - Por origem");
	                    System.out.println("3 - Por destino");
	                    System.out.print("Digite sua opção: ");
	                    int op2 = scanner.nextInt();
	                    scanner.nextLine();

	                    switch (op2) {
	                        case 1:
	                            System.out.print("Digite o número do voo: ");
	                            int num_voo = scanner.nextInt();
	                            boolean encontrado = false;
	                            for (int i = 0; i < voo.length; i++) {
	                                if (voo[i] == num_voo) {
	                                    encontrado = true;
	                                    System.out.println("Número do voo: " + voo[i]);
	                                    System.out.println("Origem: " + origem[i]);
	                                    System.out.println("Destino: " + destino[i]);
	                                    System.out.println("Lugares disponíveis: " + lugares[i]);
	                                    break;
	                                }
	                            }
	                            if (!encontrado) {
	                                System.out.println("Voo inexistente.");
	                            }
	                            break;

	                        case 2:
	                            System.out.print("Digite a origem: ");
	                            String localOrigem = scanner.nextLine();
	                            encontrado = false;
	                            for (int i = 0; i < voo.length; i++) {
	                                if (origem[i].equalsIgnoreCase(localOrigem)) {
	                                    encontrado = true;
	                                    System.out.println("Número do voo: " + voo[i]);
	                                    System.out.println("Origem: " + origem[i]);
	                                    System.out.println("Destino: " + destino[i]);
	                                    System.out.println("Lugares disponíveis: " + lugares[i]);
	                                }
	                            }
	                            if (!encontrado) {
	                                System.out.println("Nenhum voo encontrado com essa origem.");
	                            }
	                            break;

	                        case 3:
	                            System.out.print("Digite o destino: ");
	                            String localDestino = scanner.nextLine();
	                            encontrado = false;
	                            for (int i = 0; i < voo.length; i++) {
	                                if (destino[i].equalsIgnoreCase(localDestino)) {
	                                    encontrado = true;
	                                    System.out.println("Número do voo: " + voo[i]);
	                                    System.out.println("Origem: " + origem[i]);
	                                    System.out.println("Destino: " + destino[i]);
	                                    System.out.println("Lugares disponíveis: " + lugares[i]);
	                                }
	                            }
	                            if (!encontrado) {
	                                System.out.println("Nenhum voo encontrado com esse destino.");
	                            }
	                            break;

	                        default:
	                            System.out.println("Opção inválida.");
	                            break;
	                    }
	                    break;

	                case 2:
	                    System.out.print("Digite o número do voo desejado: ");
	                    int num_voo_reserva = scanner.nextInt();
	                    boolean reservado = false;
	                    for (int i = 0; i < voo.length; i++) {
	                        if (voo[i] == num_voo_reserva) {
	                            if (lugares[i] > 0) {
	                                lugares[i]--;
	                                System.out.println("Reserva confirmada!");
	                                reservado = true;
	                            } else {
	                                System.out.println("Voo lotado.");
	                                reservado = true;
	                            }
	                            break;
	                        }
	                    }
	                    if (!reservado) {
	                        System.out.println("Voo inexistente.");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Encerrando o programa. Obrigado!");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	        } while (op != 3);

	}

}
