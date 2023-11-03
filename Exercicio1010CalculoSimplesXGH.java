package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1010CalculoSimplesXGH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int numero1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();
        double valorTotal1 = numero1 * valor1;

        int codigo2 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();
        double valorTotal2 = numero2 * valor2;

        double valorTotal = valorTotal1 + valorTotal2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
}
