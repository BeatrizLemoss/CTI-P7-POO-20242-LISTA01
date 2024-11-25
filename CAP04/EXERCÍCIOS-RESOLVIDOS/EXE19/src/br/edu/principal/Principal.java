package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double altura, peso;

  
        System.out.print("Digite a altura da pessoa (em metros): ");
        altura = scanner.nextDouble();
        System.out.print("Digite o peso da pessoa (em kg): ");
        peso = scanner.nextDouble();

    
        if (altura < 1.20) {
            if (peso <= 60) {
                System.out.println("A");
            } 
            else if (peso > 60 && peso <= 90) {
                System.out.println("D");
            } 
            else {
                System.out.println("G");
            }
        } 
        else if (altura >= 1.20 && altura <= 1.70) {
            if (peso <= 60) {
                System.out.println("B");
            } 
            else if (peso > 60 && peso <= 90) {
                System.out.println("E");
            } 
            else {
                System.out.println("H");
            }
        } 
        else if (altura > 1.70) {
            if (peso <= 60) {
                System.out.println("C");
            } 
            else if (peso > 60 && peso <= 90) {
                System.out.println("F");
            } 
            else {
                System.out.println("I");
            }
        }
      
	}       
}
