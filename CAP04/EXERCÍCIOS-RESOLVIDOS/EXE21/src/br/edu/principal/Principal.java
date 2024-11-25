package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int cod_est, cod_carga;
        double peso_toneladas, peso_quilos, pre_carga, imposto, valor_total;

        System.out.print("Digite o código do estado de origem (1 a 5): ");
        cod_est = scanner.nextInt();
        System.out.print("Digite o peso da carga em toneladas: ");
        peso_toneladas = scanner.nextDouble();
        System.out.print("Digite o código da carga (10 a 40): ");
        cod_carga = scanner.nextInt();

        peso_quilos = peso_toneladas * 1000;
        System.out.println("Peso da carga em quilos: " + peso_quilos);

        if (cod_carga >= 10 && cod_carga <= 20) {
            pre_carga = 100 * peso_quilos;
        } else if (cod_carga >= 21 && cod_carga <= 30) {
            pre_carga = 250 * peso_quilos;
        } else {
            pre_carga = 340 * peso_quilos;
        }

        System.out.println("Preço da carga: R$ " + pre_carga);

        if (cod_est == 1) {
            imposto = 0.35 * pre_carga;
        } 
        else if (cod_est == 2) {
            imposto = 0.25 * pre_carga;
        } 
        else if (cod_est == 3) {
            imposto = 0.15 * pre_carga;
        } 
        else if (cod_est == 4) {
            imposto = 0.05 * pre_carga;
        } 
        else {
            imposto = 0;
        }

        System.out.println("Imposto: R$ " + imposto);

        valor_total = pre_carga + imposto;
        System.out.println("Valor total: R$ " + valor_total);
   
	}       
}
