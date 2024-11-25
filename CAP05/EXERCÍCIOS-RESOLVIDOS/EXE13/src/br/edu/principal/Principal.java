package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_cri, tot_m = 0, tot_f = 0, tot_24 = 0, tot_mortes = 0;
        double porc_m, porc_f, porc_24;
        String sexo;
        int meses;

        System.out.println("Digite o número de crianças nascidas no período: ");
        num_cri = scanner.nextInt();

        if (num_cri == 0) {
            System.out.println("Nenhuma criança digitada.");
        } else {
            for (int i = 1; i <= num_cri; i++) {
                System.out.println("Digite o sexo da " + i + "° criança (M/F): ");
                sexo = scanner.next();
                System.out.println("Digite o tempo de vida (em meses) da " + i + "° criança: ");
                meses = scanner.nextInt();

                if (meses == 0) {
                    tot_mortes++;
                    if (sexo.equals("M")) {
                        tot_m++;
                    } else if (sexo.equals("F")) {
                        tot_f++;
                    }
                }

                if (meses <= 24) {
                    tot_24++;
                }
            }

            if (tot_mortes == 0) {
                System.out.println("Nenhuma criança morreu.");
            } else {
                porc_m = (tot_m * 100.0) / tot_mortes;
                porc_f = (tot_f * 100.0) / tot_mortes;
                porc_24 = (tot_24 * 100.0) / num_cri;

                System.out.println("Percentual de crianças do sexo feminino mortas: " + porc_f + "%");
                System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_m + "%");
                System.out.println("Percentual de crianças que viveram 24 meses ou menos: " + porc_24 + "%");
            }
        }

        scanner.close();
    }
}