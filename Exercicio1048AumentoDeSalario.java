package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1048AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBase = scanner.nextDouble();
        int percentual = 0;

        if (salarioBase <= 400.00) {
            percentual = 15;
        } else if (salarioBase >= 400.01 && salarioBase <= 800.00) {
            percentual = 12;
        } else if (salarioBase >= 800.01 && salarioBase <= 1200.00) {
            percentual = 10;
        } else if (salarioBase >= 1200.01 && salarioBase <= 2000.00) {
            percentual = 7;
        } else if (salarioBase > 2000.00) {
            percentual = 4;
        }

        double reajusteGanho = salarioBase * percentual / 100;
        double novoSalario = salarioBase + reajusteGanho;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.println("Em percentual: " + percentual + " %");
    }
}
