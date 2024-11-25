package br.edu.principal;
		
		import java.util.Scanner;
		
		public class Principal {
		
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				  double pre, valorAdic = 0, imposto, preCusto, desconto = 0, novoPre;
			        String tipo, refrig;

			        System.out.print("Digite o preço do produto: ");
			        pre = scanner.nextDouble();
			        System.out.print("Digite o tipo do produto (A - Alimentação, L - Limpeza, V - Vestuário): ");
			        tipo = scanner.next().toUpperCase();
			        System.out.print("Digite se o produto necessita de refrigeração (S - Sim, N - Não): ");
			        refrig = scanner.next().toUpperCase();

			        if (refrig.equals("N")) {
			            if (tipo.equals("A")) {
			                valorAdic = (pre < 15) ? 2 : 5;
			            } 
			            else if (tipo.equals("L")) {
			                valorAdic = (pre < 10) ? 1.5 : 2.5;
			            } 
			            else if (tipo.equals("V")) {
			                valorAdic = (pre < 30) ? 3 : 2.5;
			            }
			        } 
			        else {
			            if (tipo.equals("A")) {
			                valorAdic = 8;
			            } 
			            else if (tipo.equals("L") || tipo.equals("V")) {
			                valorAdic = 0;
			            }
			        }

			        imposto = (pre < 25) ? (5 / 100.0) * pre : (8 / 100.0) * pre;

			        preCusto = pre + imposto;
			        if (!tipo.equals("A") && !refrig.equals("S")) {
			            desconto = (3 / 100.0) * preCusto;
			        }

			        novoPre = preCusto + valorAdic - desconto;

			        System.out.println("Valor adicional: " + valorAdic);
			        System.out.println("Imposto: " + imposto);
			        System.out.println("Preço de custo: " + preCusto);
			        System.out.println("Desconto: " + desconto);
			        System.out.println("Novo preço: " + novoPre);

			        if (novoPre <= 50) {
			            System.out.println("Produto classificado como: Barato");
			        } else {
			            System.out.println("Produto classificado como: Caro");
			        }

	
			}       
		}
