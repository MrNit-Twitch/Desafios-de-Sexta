package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1013Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String linha = scanner.nextLine();
        String[] valores = linha.split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int maiorAB = (a+b+Math.abs(a-b)) / 2;
        int maiorTotal = (maiorAB+c+Math.abs(maiorAB-c)) / 2;

        System.out.println(maiorTotal + " eh o maior");
    }
}
