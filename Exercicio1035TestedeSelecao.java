package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1035TestedeSelecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int somaAB = a+b;
        int somaCD = c+d;
        int aPar = a % 2;
        if (b > c && d > a && somaCD > somaAB && c>=0 && d>=0 && aPar==0 ){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}