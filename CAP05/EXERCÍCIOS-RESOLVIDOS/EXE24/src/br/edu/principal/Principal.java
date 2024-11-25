package br.edu.principal;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Menu de opções: ");
            System.out.println("1. Imposto");
            System.out.println("2. Novo Salário");
            System.out.println("3. Classificação");
            System.out.println("4. Encerrar o progama");
            System.out.println("Digite a opção desejada: ");
            int op = scanner.nextInt();
            double imposto, novo_salario = 0;
            if(op > 4 || op < 0 ){
                System.out.println("Opção inválida!Tente novamente");
            }
            else if(op == 4){
                System.out.println("Encerrando...");
                break;
            }
            else if(op == 1 ){
                System.out.println("Insira o valor do salário: ");
                double salario = scanner.nextDouble();
                if(salario < 500){
                    imposto = salario * 0.05;
                    System.out.println("Imposto: "+ imposto);
                }
                else if(salario >= 500 && salario <= 850){
                    imposto = salario * 0.1;
                    System.out.println("Imposto: "+ imposto);
            }
                else if(salario > 850){
                    imposto = salario * 0.15;
                    System.out.println("Imposto: "+ imposto);
            }
                
            }
            else if(op == 2){
                System.out.println("Insira o valor do salário: ");
                double salario = scanner.nextDouble();
                if(salario > 1500){
                    novo_salario = salario + 25;
                }
                else if(salario >= 750 && salario <= 1500){
                    novo_salario = salario + 50;
                }
                else if(salario >= 450 && salario < 750){
                    novo_salario = salario + 75;
                }
                else if(salario < 450){
                    novo_salario = salario + 100;
            }
                System.out.println("Seu novo salário é " + novo_salario + " reais");
            }
            else if(op == 3){
                System.out.println("Insira o valor do salário: ");
                double salario = scanner.nextDouble();
                if(salario <= 700){
                    System.out.println("Mal renumerado.");
                }
                else if(salario >= 700){
                    System.out.println("Bem renumerado.");
                }
        }
    }
    }
}