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

        //Hours

        if (startHour < finishHour){
            hour = finishHour - startHour;
        }

        if (startHour > finishHour) {
            hour = 24 - startHour + finishHour;
        }

        //Minutes

        if (startMinute == finishMinute){
            minute = 0;
        }

        if (startMinute < finishMinute){
            minute = finishMinute - startMinute;
        }

        if (startMinute > finishMinute && startHour != finishHour){
            minute = 60 - startMinute + finishMinute;
            hour--;
        } else if (startMinute > finishMinute && startHour == finishHour){
            minute = 60 - startMinute + finishMinute;
            hour = 23;
        }

        if (startHour == finishHour && startMinute == finishMinute){
            hour = 24;
        }

        System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + minute + " MINUTO(S)");
    }
}
