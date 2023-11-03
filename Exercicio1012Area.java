package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1012Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double calculoTiangulo = a * c / 2;
        double calculoCirculo = 3.14159 * Math.pow(c, 2);
        double calculoTrapezio = (a + b) * c / 2;
        double calculoQuadrado = b * b;
        double calculoRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", calculoTiangulo);
        System.out.printf("CIRCULO: %.3f\n", calculoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", calculoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", calculoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", calculoRetangulo);
    }
}
