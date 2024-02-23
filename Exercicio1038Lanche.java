package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1038Lanche {
    public static void main(String[] args) {
        //1 - 4,0 /2 - 4,50 / 3 - 5,00 / 4 - 2,00 / 5 - 1,50
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        int quant = scanner.nextInt();
        double valor = 0;

        if (cod == 1){
            valor = 4;
        } else if (cod == 2) {
            valor = 4.5;
        } else if (cod == 3) {
            valor = 5;
        } else if (cod == 4) {
            valor = 2;
        } else if (cod == 5) {
            valor = 1.5;
        }

        double calculo = quant * valor;

        System.out.printf("Total: R$ %.2f\n", calculo);
    }
}
