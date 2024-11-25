package br.edu.principal;

public class principal {

    public static void main(String[] args) {
        int ano = 2024;
        int mes = 11;
        int dia = 22;
        int hora = 14;
        int minuto = 30;

        int dias = 0;
        for (int i = 1970; i < ano; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        for (int i = 1; i < mes; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                dias += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dias += 30;
            } else if (i == 2) {
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    dias += 29;
                } else {
                    dias += 28;
                }
            }
        }

        dias += dia - 1;

        int minutosTotais = (hora * 60) + minuto;

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        if (mes == 1) System.out.print("janeiro");
        else if (mes == 2) System.out.print("fevereiro");
        else if (mes == 3) System.out.print("março");
        else if (mes == 4) System.out.print("abril");
        else if (mes == 5) System.out.print("maio");
        else if (mes == 6) System.out.print("junho");
        else if (mes == 7) System.out.print("julho");
        else if (mes == 8) System.out.print("agosto");
        else if (mes == 9) System.out.print("setembro");
        else if (mes == 10) System.out.print("outubro");
        else if (mes == 11) System.out.print("novembro");
        else if (mes == 12) System.out.print("dezembro");
        System.out.println("");
        System.out.println("Hora Atual: " + hora + ":" + minuto);
    }
}
