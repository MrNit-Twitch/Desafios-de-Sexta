package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1005Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double notaPeso1 = nota1 * 3.5;
        double notaPeso2 = nota2 * 7.5;
        double media = (notaPeso1 + notaPeso2) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
