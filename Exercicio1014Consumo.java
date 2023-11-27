package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1014Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        double litro = scanner.nextDouble();
        double kml = km / litro;

        System.out.printf("%.3f km/l\n" , kml);
    }
}
