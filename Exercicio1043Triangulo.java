package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1043Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n1 = scanner.nextDouble();
        Double n2 = scanner.nextDouble();
        Double n3 = scanner.nextDouble();
        Double perimetro;
        Double area;

        if (n1 + n2 > n3 && n3 + n2 > n1 && n1 + n3 > n2) {
            perimetro = n1 + n2 + n3;
            System.out.println("Perimetro = " + perimetro);
        } else {
            area = ((n1 + n2) * n3) / 2.0;
            System.out.println("Area = " + area);
        }
    }
}
