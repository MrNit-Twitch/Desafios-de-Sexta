package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1017GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        int kml = 12;
        double consumo = (double) (tempo * velocidadeMedia) / kml;
        System.out.printf("%.3f\n", consumo);
    }
}
