package br.edu.principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, menor_idade = Integer.MAX_VALUE;
        double tot = 0, qtdmulheres = 0, qtdhomens = 0, cont_f = 0, soma1 = 0, cont_m = 0, conta_m2 = 0;
        String sexo, experiencia;

        while (true) {
            System.out.println("Digite a idade do candidato (ou 0 para sair): ");
            idade = scanner.nextInt();

            if (idade == 0) { 
                break;
            }

            System.out.println("Digite o sexo (M para masculino, F para feminino): ");
            sexo = scanner.next();

            System.out.println("Digite se tem experiência no serviço (S para sim, N para não): ");
            experiencia = scanner.next();

            
            if (sexo.equalsIgnoreCase("F") && experiencia.equalsIgnoreCase("S")) {
                if (tot == 0) { 
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) { 
                    menor_idade = idade;
                }
            }

            
            if (sexo.equalsIgnoreCase("M")) {
                qtdhomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                qtdmulheres++;
            }

            if (sexo.equalsIgnoreCase("F") && idade < 21 && experiencia.equalsIgnoreCase("S")) {
                cont_f++;
            }
            
            if (sexo.equalsIgnoreCase("M") && idade > 45) {
                cont_m++;
            }
            
            if (sexo.equalsIgnoreCase("M") && experiencia.equalsIgnoreCase("S")) {
                soma1 += idade;
                conta_m2++;
            }
        }

        
        System.out.println("Número de candidatas do sexo feminino: " + qtdmulheres);
        System.out.println("Número de candidatos do sexo masculino: " + qtdhomens);

        if (conta_m2 == 0) {
            System.out.println("Nenhum homem com experiência foi registrado.");
        } else {
            double meia_idade = soma1 / conta_m2;
            System.out.println("Idade média dos homens com experiência: " + meia_idade);
        }

        if (qtdhomens == 0) {
            System.out.println("Nenhum homem foi registrado.");
        } else {
            double percentual = (cont_m * 100) / qtdhomens;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + percentual);
        }

        System.out.println("Número de mulheres com menos de 21 anos e com experiência: " + cont_f);

        if (menor_idade == Integer.MAX_VALUE) {
            System.out.println("Nenhuma mulher com experiência foi registrada.");
        } else {
            System.out.println("A menor idade entre as mulheres com experiência: " + menor_idade);
        }
        scanner.close();
    }
}