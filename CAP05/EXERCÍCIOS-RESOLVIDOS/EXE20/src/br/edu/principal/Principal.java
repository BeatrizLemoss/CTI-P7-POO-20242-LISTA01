package br.edu.principal;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double cod, num_h, sal_b, sal_l, media_m = 0, media_f = 0;
        String sexo;
        int cont_m = 0, cont_f = 0;
        
        System.out.println("Insira o valor do código: ");
        cod = scanner.nextDouble();
        
        while (cod != 99999) {
            System.out.println("Insira o sexo:");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("M")) {
                System.out.println("Insira o número de horas trabalhadas: ");
                num_h = scanner.nextDouble();
                sal_b = num_h * 30;
                sal_l = sal_b - (sal_b * 0.1);
                media_m += sal_l;  
                cont_m++;
                
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println("Insira o número de horas trabalhadas: ");
                num_h = scanner.nextDouble();
                sal_b = num_h * 30;
                sal_l = sal_b - (sal_b * 0.05);
                media_f += sal_l;  
                cont_f++;
                
            } else {
                System.out.println("Resposta inválida. Tente novamente!");
                continue; 
            }
            
            System.out.println("O código é " + cod);
            System.out.println("O salário bruto é " + sal_b);
            System.out.println("O salário líquido é " + sal_l);
            
            System.out.println("Insira o valor do código: ");
            cod = scanner.nextDouble();
        }
        
        
        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino!");
        } else {
            media_m = media_m / cont_m;
            System.out.println("Média dos salários líquidos dos professores do sexo masculino: " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhuma professora do sexo feminino!");
        } else {
            media_f = media_f / cont_f;
            System.out.println("Média dos salários líquidos das professoras do sexo feminino: " + media_f);
        }
        
        scanner.close();
    }
}
