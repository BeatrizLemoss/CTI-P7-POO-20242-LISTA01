package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a nota do trabalho de laboratório:");
        double trabalho_laboratorio = scanner.nextDouble();
        System.out.println("Insira a nota da avaliação semestral:");
        double avaliacao_semestral = scanner.nextDouble();
        System.out.println("Insira a nota do exame final:");
        double exame_final = scanner.nextDouble();
        double media = (trabalho_laboratorio * 2 + avaliacao_semestral *3 + exame_final *5)/10;
        System.out.println("A média ponderada é " + media);
        if (media >= 8 && media <= 10){
            System.out.println("Obteve conceito A");
        }
        else if (media >=7 && media <8){
            System.out.println("Obteve conceito B");
        }
        else if(media >=6 && media <7){
            System.out.println("Obteve conceito C");
        }
        else if(media >=5 && media <6){
            System.out.println("Obteve conceito D");
        }
        else if(media >=0 && media <5){
            System.out.println("Obteve conceito E");
        }
        scanner.close();
    }
}
