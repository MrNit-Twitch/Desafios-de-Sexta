package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1007Diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int diferenca = num1*num2 - num3*num4;
        System.out.println("DIFERENÇA = " + diferenca);
    }
}
