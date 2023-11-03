package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1006Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        a = a * 2;
        b = b * 3;
        c = c * 5;
        Double media = (a + b + c) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
