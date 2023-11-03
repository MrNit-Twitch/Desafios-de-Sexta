package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1010CalculoSimplesCorreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine(); // 12 1 5.30
        String entrada2 = sc.nextLine(); // 16 2 5.10

        String[] valores = entrada.split(" "); // ["12","1", "5.30"]
        String[] valores2 = entrada2.split(" "); // ["16", "2", "5.10"]

        Double resultado = Integer.parseInt(valores[1]) * Double.parseDouble(valores[2]);
        Double resultado2 = Integer.parseInt(valores2[1]) * Double.parseDouble(valores2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado + resultado2);
    }
}
