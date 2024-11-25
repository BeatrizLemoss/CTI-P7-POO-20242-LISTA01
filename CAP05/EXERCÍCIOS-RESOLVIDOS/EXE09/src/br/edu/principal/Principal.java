package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 5.5;
        double nota3 = 3.2;
        double nota4 = 7.8;
        double nota5 = 6.5;
        double nota6 = 4.0;
        double nota7 = 9.1;
        double nota8 = 2.5;
        double nota9 = 6.8;
        double nota10 = 7.3;

        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaNotas = 0;

        if (nota1 >= 7.0) {
            totalAprovados++;
        } else if (nota1 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota2 >= 7.0) {
            totalAprovados++;
        } else if (nota2 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota3 >= 7.0) {
            totalAprovados++;
        } else if (nota3 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota4 >= 7.0) {
            totalAprovados++;
        } else if (nota4 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota5 >= 7.0) {
            totalAprovados++;
        } else if (nota5 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota6 >= 7.0) {
            totalAprovados++;
        } else if (nota6 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota7 >= 7.0) {
            totalAprovados++;
        } else if (nota7 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota8 >= 7.0) {
            totalAprovados++;
        } else if (nota8 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota9 >= 7.0) {
            totalAprovados++;
        } else if (nota9 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        if (nota10 >= 7.0) {
            totalAprovados++;
        } else if (nota10 >= 3.0) {
            totalExame++;
        } else {
            totalReprovados++;
        }

        somaNotas = nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10;

        double mediaClasse = somaNotas / 10;

        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);
        System.out.println("Média da classe: " + mediaClasse);
    }
}

