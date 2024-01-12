package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1020IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        int ano = dia / 365;
        int restoAno = dia % 365;
        int mes = restoAno / 30;
        int restoMes = restoAno % 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(a)\n" , ano, mes, restoMes);
        /*System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(restoMes + " dia(s)");*/
    }
}
