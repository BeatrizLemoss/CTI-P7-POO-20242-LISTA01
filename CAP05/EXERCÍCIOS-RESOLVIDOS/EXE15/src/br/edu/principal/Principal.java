package br.edu.principal;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        double preco, custo_est, imp, preco_final, adicional, maior_p, menor_p, tot_imp, qtd_b, qtd_n, qtd_c;
        String refri, categ;
        adicional = 0;
        tot_imp = 0;
        qtd_b = 0;
        qtd_n = 0;
        qtd_c = 0;
        maior_p = 0;
        menor_p = Double.MAX_VALUE;

        for (i = 1; i <= 12; i++) {
            System.out.println("Insira o valor do preço:");
            preco = scanner.nextDouble();
            System.out.println("Insira o refrigerante (S ou N):");
            refri = scanner.next();
            System.out.println("Insira a categoria (A, L ou V):");
            categ = scanner.next();

            if (preco <= 20) {
                if (categ.equalsIgnoreCase("A")) {
                    custo_est = 2;
                } else if (categ.equalsIgnoreCase("L")) {
                    custo_est = 3;
                } else {
                    custo_est = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equalsIgnoreCase("S")) {
                    custo_est = 6;
                } else {
                    custo_est = 0;
                }
            } else {
                if (refri.equalsIgnoreCase("S")) {
                    if (categ.equalsIgnoreCase("A")) {
                        custo_est = 5;
                    } else if (categ.equalsIgnoreCase("L")) {
                        custo_est = 2;
                    } else {
                        custo_est = 4;
                    }
                } else {
                    if (categ.equalsIgnoreCase("A") || categ.equalsIgnoreCase("V")) {
                        custo_est = 0;
                    } else {
                        custo_est = 1;
                    }
                }
            }

            if (categ.equalsIgnoreCase("A") && refri.equalsIgnoreCase("S")) {
                imp = preco * 0.04;
            } else {
                imp = preco * 0.02;
            }

            preco_final = preco + custo_est + imp;

            String classificacao = "";
            if (preco_final <= 20) {
                classificacao = "Barato";
                qtd_b++;
            }
            else {
                classificacao = "Caro";
                qtd_c++;
            }

            if (preco_final > maior_p) {
                maior_p = preco_final;
            }
            if (preco_final < menor_p) {
                menor_p = preco_final;
            }

            adicional += custo_est + imp;
            tot_imp += imp;

            System.out.println("Preço unitário: " + preco);
            System.out.println("Custo de estocagem: " + custo_est);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço final: " + preco_final);
            System.out.println("Classificação: " + classificacao);
            System.out.println();
        }

        double media_adicionais = adicional / 12;

        System.out.println("Média dos valores adicionais (custos de estocagem e impostos): R$ " + media_adicionais);
        System.out.println("Maior preço final: " + maior_p);
        System.out.println("Menor preço final:  " + menor_p);
        System.out.println("Total dos impostos:  " + tot_imp);
        System.out.println("Quantidade de produtos classificados como barato: " + qtd_b);
        System.out.println("Quantidade de produtos classificados como normal: " + qtd_n);
        System.out.println("Quantidade de produtos classificados como caro: " + qtd_c);
        scanner.close();
    }
}

