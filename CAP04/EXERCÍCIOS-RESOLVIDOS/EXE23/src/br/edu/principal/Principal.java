package br.edu.principal;
	
	import java.util.Scanner;
	
	public class Principal {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			  double salMin, nht, coeficiente = 0, salBruto, imposto, grat, auxilio, salLiq;
		        char turno, categoria;

		        System.out.print("Digite o valor do salário mínimo: ");
		        salMin = scanner.nextDouble();
		        System.out.print("Digite o turno de trabalho (M - Matutino, V - Vespertino, N - Noturno): ");
		        turno = scanner.next().toUpperCase().charAt(0);
		        System.out.print("Digite a categoria (O - Operário, G - Gerente): ");
		        categoria = scanner.next().toUpperCase().charAt(0);
		        System.out.print("Digite o número de horas trabalhadas no mês: ");
		        nht = scanner.nextDouble();

		        if (turno == 'M') {
		            coeficiente = 0.10 * salMin;
		        } 
		        else if (turno == 'V') {
		            coeficiente = 0.15 * salMin;
		        } 
		        else if (turno == 'N') {
		            coeficiente = 0.12 * salMin;
		        } 
		        else {
		            System.out.println("Turno inválido.");
		            return; 
		        }
		        System.out.println("Coeficiente: " + coeficiente);

		        salBruto = nht * coeficiente;
		        System.out.println("Salário Bruto: " + salBruto);

		        if (categoria == 'O') {
		            if (salBruto >= 300) {
		                imposto = 0.05 * salBruto;
		            } 
		            else {
		                imposto = 0.03 * salBruto;
		            }
		        } 
		        else {
		            if (salBruto >= 400) {
		                imposto = 0.06 * salBruto;
		            } else {
		                imposto = 0.04 * salBruto;
		            }
		        }
		        System.out.println("Imposto: " + imposto);

		        if (turno == 'N' && nht > 80) {
		            grat = 50;
		        } 
		        else {
		            grat = 30;
		        }
		        System.out.println("Gratificação: " + grat);

		        if (categoria == 'O' || coeficiente <= 25) {
		            auxilio = (1.0 / 3) * salBruto;
		        } 
		        else {
		            auxilio = (1.0 / 2) * salBruto;
		        }
		        System.out.println("Auxílio: " + auxilio);

		        salLiq = salBruto - imposto + grat + auxilio;
		        System.out.println("Salário Líquido: " + salLiq);

		        if (salLiq < 350) {
		            System.out.println("Classificação: Mal Remunerado");
		        } 
		        else if (salLiq >= 350 && salLiq <= 600) {
		            System.out.println("Classificação: Normal");
		        } 
		        else {
		            System.out.println("Classificação: Bem Remunerado");
		        }


		}       
	}
