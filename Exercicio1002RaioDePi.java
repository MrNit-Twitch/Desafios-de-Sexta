package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1002RaioDePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = n* Math.pow(raio,2);

        System.out.printf("A=%.4f\n" ,area);
    }
}
