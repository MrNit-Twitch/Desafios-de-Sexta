package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1009SalarioComBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        double comissao = totalVendas * 0.15;
        double salarioComComissao = comissao + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f\n", salarioComComissao);
    }
}
