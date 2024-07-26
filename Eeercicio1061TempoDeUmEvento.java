package desafiosDeSexta;

import java.util.Arrays;
import java.util.Scanner;

public class Eeercicio1061TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia ");
        String iniDay = scanner.nextLine();
        String[] iniTime = scanner.nextLine().split(" : ");
        System.out.print("Dia ");
        String finDay = scanner.nextLine();
        String[] finTime = scanner.nextLine().split(" : ");

        System.out.println("-----------------------------------");
        System.out.println(iniDay + " dia (s)");
        System.out.println(Arrays.toString(iniTime) + " hora (s)");
        System.out.println(finDay + " minuto (s)");
        System.out.println(Arrays.toString(finTime) + " segundo (s)");

    }
}
