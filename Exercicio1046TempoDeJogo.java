package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1046TempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();
        int result = 0;

        if (start == finish){
            result = 24;
        }

        if (start < finish){
            result = finish - start;
        } else {
            result = 24 - start + finish;
        }

        System.out.println("O JOGO DUROU " + result + " HORA(S)");
    }
}
