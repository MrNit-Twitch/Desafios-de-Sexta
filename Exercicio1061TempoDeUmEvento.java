package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1061TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia ");
        String iniDay = scanner.nextLine();
        String[] iniTime = scanner.nextLine().split(" : ");
        System.out.print("Dia ");
        String finDay = scanner.nextLine();
        String[] finTime = scanner.nextLine().split(" : ");

        int iniDayInSec = Integer.parseInt(iniDay) * 86400;
        int finDayInSec = Integer.parseInt(finDay) * 86400;
        int iniHourInSec = Integer.parseInt(iniTime[0]) * 3600;
        int finHourInSec = Integer.parseInt(finTime[0]) * 3600;
        int iniMinInSec = Integer.parseInt(iniTime[1]) * 60;
        int finMinInSec = Integer.parseInt(finTime[1]) * 60;
        int iniSec = Integer.parseInt(iniTime[2]);
        int finSec = Integer.parseInt(finTime[2]);
        int totDay = 0;
        int totHour = 0;
        int totMin = 0;
        int totSec = 0;

        totDay = (finDayInSec - iniDayInSec) / 86400;
        if (finHourInSec > iniHourInSec) {
            totHour = (finHourInSec - iniHourInSec) / 3600;
        } else {
            totHour = (86400 - (iniHourInSec - finHourInSec)) / 3600;
            totDay = totDay - 1;
        }

        if (finMinInSec > iniMinInSec) {
            totMin = (finMinInSec - iniMinInSec) / 60;
        } else {
            totMin = (3600 - (finMinInSec - finMinInSec)) / 60;
            totHour = totHour - 1;
        }

        if (finSec >= iniSec) {
            totSec = (finSec - iniSec);
        } else {
            totSec = (60 - (finSec - iniSec));
            totMin = totMin - 1;
        }

        System.out.println(totDay + " dia (s)");
        System.out.println(totHour + " hora (s)");
        System.out.println(totMin + " minuto (s)");
        System.out.println(totSec + " segundo (s)");
    }
}
