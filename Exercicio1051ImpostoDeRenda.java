package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1051ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        if (salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            salario = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n" , salario);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            salario = (1000 * 0.08) + ((salario - 3000) * 0.18);
            System.out.printf("R$ %.2f\n" , salario);
        } else if (salario > 4500.00) {
            salario = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
            System.out.printf("R$ %.2f\n" , salario);
        }
    }
}
