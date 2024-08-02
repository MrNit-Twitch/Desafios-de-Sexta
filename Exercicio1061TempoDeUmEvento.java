package desafiosDeSexta;

import java.util.Arrays;
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

        int iniDayInt = Integer.parseInt(iniDay) * 86400;
        int finDayInt = Integer.parseInt(finDay) * 86400;
        int iniHourInSec = Integer.parseInt(iniTime[0]) * 3600;
        int finHourInSec = Integer.parseInt(iniTime[0]) * 3600;
        int iniMinInSec = Integer.parseInt(iniTime[1]) * 60;
        int finMinInSec = Integer.parseInt(iniTime[1]) * 60;
        int iniSec = Integer.parseInt(iniTime[2]);
        int finSec = Integer.parseInt(iniTime[2]);
        int totSec = 0;

        int totIniInSec = iniDayInt + iniHourInSec + iniMinInSec + iniSec;
        int totFinInSec = finDayInt + finHourInSec + finMinInSec + finSec;

        if (totFinInSec > totIniInSec) {
            totSec = totFinInSec - totIniInSec;
        } else {
            //totSec = paramos aqui.
            /*EXEMPLO //Hours

            if (startHour < finishHour){
                hour = finishHour - startHour;
            }

            if (startHour > finishHour) {
                hour = 24 - startHour + finishHour;
            }*/
        }

        int totDay = 0; //ainda não calculei

        System.out.println(totDay + " dia (s)");
        System.out.println(Arrays.toString(iniTime) + " hora (s)");
        System.out.println(finDay + " minuto (s)");
        System.out.println(Arrays.toString(finTime) + " segundo (s)");

    }
}
