package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1036FormulaDeBaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double raizBaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raizBaskara2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", raizBaskara1);
            System.out.printf("R2 = %.5f\n", raizBaskara2);
        }
    }
}
