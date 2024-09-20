package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1061TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] iniDay = scanner.nextLine().split("\\s");
        String[] iniTime = scanner.nextLine().split(" : ");
        String[] finDay = scanner.nextLine().split("\\s");
        String[] finTime = scanner.nextLine().split(" : ");

        int iniDayInSec = Integer.parseInt(iniDay[1]) * 86400;
        int finDayInSec = Integer.parseInt(finDay[1]) * 86400;
        int iniHourInSec = Integer.parseInt(iniTime[0]) * 3600;
        int finHourInSec = Integer.parseInt(finTime[0]) * 3600;
        int iniMinInSec = Integer.parseInt(iniTime[1]) * 60;
        int finMinInSec = Integer.parseInt(finTime[1]) * 60;
        int iniSec = Integer.parseInt(iniTime[2]);
        int finSec = Integer.parseInt(finTime[2]);
        int totDay;
        int totHour;
        int totMin;
        int totSec;

        totDay = (finDayInSec - iniDayInSec) / 86400;
        if (finHourInSec > iniHourInSec) {
            totHour = (finHourInSec - iniHourInSec) / 3600;
            if (totHour == 24) {
                totHour = 00;
                totDay = totDay + 1;
            }
        } else {
            totHour = (86400 - (iniHourInSec - finHourInSec)) / 3600;
            totDay = totDay - 1;
            if (totHour == 24) {
                totHour = 00;
                totDay = totDay + 1;
            }
        }

        if (finMinInSec > iniMinInSec) {
            totMin = (finMinInSec - iniMinInSec) / 60;
            if (totMin == 60) {
                totMin = 00;
                totHour = totHour + 1;
            }
        } else {
            totMin = (3600 - (finMinInSec - iniMinInSec)) / 60;
            totHour = totHour - 1;
            if (totMin == 60) {
                totMin = 00;
                totHour = totHour + 1;
            }
        }

        if (finSec >= iniSec) {
            totSec = (finSec - iniSec);
        } else {
            totSec = (60 + (finSec - iniSec));
        }

        System.out.println(totDay + " dia(s)");
        System.out.println(totHour + " hora(s)");
        System.out.println(totMin + " minuto(s)");
        System.out.println(totSec + " segundo(s)");
    }
}
