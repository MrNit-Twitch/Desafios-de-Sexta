package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1008Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFun = scanner.nextInt();
        int horTra = scanner.nextInt();
        double salHor = scanner.nextDouble();
        double salario = horTra * salHor;
        System.out.println("NUMBER = " + numFun);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
