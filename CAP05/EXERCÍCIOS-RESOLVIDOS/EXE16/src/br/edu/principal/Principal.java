package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Insira o valor da base: ");
            double base = sc.nextDouble();
            if(base > 0){
                System.out.println("Insira o valor da altura:");
                double altura = sc.nextDouble();
                if(altura > 0){
                    
                    double area = base *altura/2;
                    System.out.println("A área do triângulo é " + area);
                    break;
                }
                else{
                    System.out.println("Insira um valor válido para a altura");
                }
            }
            else{
                System.out.println("Insira um valor válido para a base");
            }
           
        }
        sc.close();
    }
    
    }