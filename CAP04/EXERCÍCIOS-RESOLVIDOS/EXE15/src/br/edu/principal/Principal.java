package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sal_min, nht, ndep, nhet, sal_receber, 
		vh, smes, vdep, vhe, imp, sbruto, sliq, grat;

       
        System.out.println("Digite o valor do salário mínimo: ");
        sal_min = scanner.nextDouble();
        System.out.println("Digite o número de horas trabalhadas: ");
        nht = scanner.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        ndep = scanner.nextDouble();
        System.out.println("Digite o número de horas extras trabalhadas: ");
        nhet = scanner.nextDouble();

        vh = sal_min / 5;
        smes = nht * vh;
        vdep = 32 * ndep;
        vhe = nhet * (vh + (vh * 50 / 100));
        sbruto = smes + vdep + vhe;

        if (sbruto < 200) {
            imp = 0;
        } 
        else if (sbruto >= 200 && sbruto <= 500) {
            imp = sbruto * 10 / 100;
        }
        else {
            imp = sbruto * 20 / 100;
        }

        sliq = sbruto - imp;

        if (sliq <= 350) {
            grat = 100;
        } 
        else {
            grat = 50;
        }

        sal_receber = sliq + grat;


        System.out.print("O salário a receber é: R$ " + sal_receber);

	}
	        
}
