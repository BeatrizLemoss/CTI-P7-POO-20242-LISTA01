package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        double sal_carlos = 1250;
        double sal_joao = sal_carlos /3;
        int meses = 0;
        while (sal_joao < sal_carlos ){
            sal_carlos += (sal_carlos * 0.02);
            sal_joao += (sal_joao *0.05);
            meses +=1;
        }
        System.out.println("A quantidade de meses restantes é de " + meses + " meses");
    }
    
}
