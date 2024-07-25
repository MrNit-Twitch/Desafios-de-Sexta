package desafiosDeSexta;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicios1060NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[6];
        int par = 0;
        num[0] = scanner.nextDouble();
        num[1] = scanner.nextDouble();
        num[2] = scanner.nextDouble();
        num[3] = scanner.nextDouble();
        num[4] = scanner.nextDouble();
        num[5] = scanner.nextDouble();

        for (int i = 0; i < 6; i++) {
            if (num[i] > 0){
                par++;
            }
        }
        System.out.println(par + " valores positivos");
    }
}
