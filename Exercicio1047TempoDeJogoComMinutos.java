package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1047TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int finishHour = scanner.nextInt();
        int finishMinute = scanner.nextInt();
        int hour = 0;
        int minute = 0;

        if (startHour == finishHour){
            hour = 24;
        }

        if (startHour < finishHour){
            hour = finishHour - startHour;
        } else {
            hour = 24 - startHour + finishHour;
        }

        if (startMinute == finishMinute){
            minute = 0;
        }

        if (startMinute < finishMinute){
            minute = finishMinute - finishHour;
        } else {
            minute = 60 - startMinute + finishMinute;
        }

        System.out.println("O JOGO DUROU " + hour + " HORA(S) e " + minute + " MINUTO(S)");
    }
}
