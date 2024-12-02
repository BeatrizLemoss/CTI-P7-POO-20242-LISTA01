package br.edu.principal;

public class principal {

	public static void main(String[] args) {
        int[] qtd = {5, 3, 8, 2, 6, 10, 4, 7, 1, 9};
        double[] preco = {20.0, 15.0, 30.0, 25.0, 10.0, 50.0, 40.0, 35.0, 45.0, 60.0};
        double totGeral = 0, comissao;
        int maiorQtd = qtd[0], ind = 0;

        System.out.println("Relatório de Vendas:");
        for (int i = 0; i < 10; i++) {
            double totVend = qtd[i] * preco[i];
            System.out.println("Quantidade: " + qtd[i] + " | Preço Unitário: R$" + preco[i] + " | Total: R$" + totVend);
            totGeral += totVend;
        }

        comissao = totGeral * 0.05;
        System.out.println("\nValor Geral das Vendas: R$" + totGeral);
        System.out.println("Comissão do Vendedor: R$" + comissao);

        for (int i = 1; i < 10; i++) {
            if (qtd[i] > maiorQtd) {
                maiorQtd = qtd[i];
                ind = i;
            }
        }


        System.out.println("\nObjeto Mais Vendido: Preço Unitário R$" + preco[ind] + " | Posição no Vetor: " + (ind + 1));
    }
}
