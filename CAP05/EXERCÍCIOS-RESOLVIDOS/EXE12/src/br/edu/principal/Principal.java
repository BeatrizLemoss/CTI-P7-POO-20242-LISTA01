package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double num_op, pecas_op, n_maior = 0, cont_m = 0, cont_f = 0, tot_pecas = 0, media_m = 0, salario_maior = 0, media_f = 0, salario_op, tot_folha = 0;
        int cont;
        Scanner scanner = new Scanner(System.in);
        
        for (cont = 1; cont <= 15; cont++) {
            System.out.println("Insira o número do " + cont + "° operário: ");
            num_op = scanner.nextDouble();
            
            System.out.println("Insira o sexo do operário (M ou F): ");
            String sexo_op = scanner.next();
            
            System.out.println("Insira o número total de peças fabricadas pelo " + cont + "° operário: ");
            pecas_op = scanner.nextDouble();

            if (pecas_op <= 30) {
                salario_op = 450;
            } else if (pecas_op <= 50) {
                salario_op = 450 + ((pecas_op - 30) * 0.03 * 450);
            } else {
                salario_op = 450 + ((pecas_op - 30) * 0.05 * 450);
            }

            System.out.println("O operário de número " + num_op + " recebe salário = " + salario_op);
            
            tot_folha += salario_op;
            tot_pecas += pecas_op;

            if (sexo_op.equalsIgnoreCase("M")) {
                media_m += pecas_op;
                cont_m++;
            } else {
                media_f += pecas_op;
                cont_f++;
            }

            if (cont == 1 || salario_op > salario_maior) {
                salario_maior = salario_op;
                n_maior = num_op;
            }
        }

        System.out.println("Total da folha de pagamento = " + tot_folha);
        System.out.println("Total de peças fabricadas no mês = " + tot_pecas);

        if (cont_m > 0) {
            media_m /= cont_m;
            System.out.println("Média de peças fabricadas por homens = " + media_m);
        } else {
            System.out.println("Nenhum Homem");
        }

        if (cont_f > 0) {
            media_f /= cont_f;
            System.out.println("Média de peças fabricadas por mulheres = " + media_f);
        } else {
            System.out.println("Nenhuma Mulher");
        }

        System.out.println("O número do operário com maior salário é " + n_maior);
        
        scanner.close();
    }
}