package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1019ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hora = n / 3600;
        int restoHora = n % 3600;
        int minuto = restoHora / 60;
        int restoMinuto = restoHora % 60;
        System.out.println(hora + ":" + minuto + ":" + restoMinuto + "\n");
    }
}
