package br.edu.principal;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double salario, qtd, tipo, valor_kw, gasto;
        double acresc = 0, total, tot_geral, qtd_cons;
        tot_geral = 0;
        qtd_cons = 0;
        
        System.out.println("Insira o valor do salário mínimo:");
        salario = scanner.nextDouble();
        
        valor_kw = salario / 8;
        
        while(true){
            System.out.println("Insira a quantidade de quilowatts consumidos (ou 0 para sair):");
            qtd = scanner.nextDouble();
            if(qtd == 0) {
                break;
            }
            
            gasto = qtd * valor_kw;
            System.out.println("Insira o tipo de consumidor: ");
            tipo = scanner.nextDouble();
            
            if(tipo == 1){
                acresc = gasto * 0.05;
            }
            else if(tipo == 2){
                acresc = gasto * 0.1;
            }
            else if(tipo == 3){
                acresc = gasto * 0.15;
            }
            else{
                System.out.println("Tipo de consumidor inválido.");
                continue;
            }
            
            total = gasto + acresc;
            tot_geral += total;
            
            if(total >= 500 && total <= 1000){
                qtd_cons++;
            }
            
            System.out.println("Gasto sem acréscimo: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total a pagar: " + total);
        }
        
        System.out.println("Total geral de pagamento: " + tot_geral);
        System.out.println("Quantidade de consumidores com conta entre 500 e 1000: " + qtd_cons);
    }
}