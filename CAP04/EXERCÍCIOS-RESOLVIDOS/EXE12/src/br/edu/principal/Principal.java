package br.edu.principal;
import java.util.Scanner;
public class Principal{

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
		        int cargo = scanner.nextInt();
		        
		        System.out.print("Digite o valor do salário: ");
		        double salario = scanner.nextDouble();

		        double aumento = 0;
		        double novo_sal = salario;

		        switch (cargo) {
		            case 1:
		                System.out.println("O cargo é Escriturário");
		                aumento = salario * 50 / 100;
		                System.out.println("O valor do aumento é: " + aumento);
		                novo_sal = salario + aumento;
		                System.out.println("O novo salário é: " + novo_sal);
		                break;
		            case 2:
		                System.out.println("O cargo é Secretário");
		                aumento = salario * 35 / 100;
		                System.out.println("O valor do aumento é: " + aumento);
		                novo_sal = salario + aumento;
		                System.out.println("O novo salário é: " + novo_sal);
		                break;
		            case 3:
		                System.out.println("O cargo é Caixa");
		                aumento = salario * 20 / 100;
		                System.out.println("O valor do aumento é: " + aumento);
		                novo_sal = salario + aumento;
		                System.out.println("O novo salário é: " + novo_sal);
		                break;
		            case 4:
		                System.out.println("O cargo é Gerente");
		                aumento = salario * 10 / 100;
		                System.out.println("O valor do aumento é: " + aumento);
		                novo_sal = salario + aumento;
		                System.out.println("O novo salário é: " + novo_sal);
		                break;
		            case 5:
		                System.out.println("O cargo é Diretor");
		                aumento = salario * 0 / 100;
		                System.out.println("O valor do aumento é: " + aumento);
		                novo_sal = salario + aumento;
		                System.out.println("O novo salário é: " + novo_sal);
		                break;
		            default:
		                System.out.println("Cargo Inexistente!");
		                break;
		        }

		        scanner.close();
		    }
}