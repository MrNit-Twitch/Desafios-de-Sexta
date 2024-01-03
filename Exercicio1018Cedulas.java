package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1018Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        int divisao100 = valor / 100;
        int restoDivisao100 = valor % 100;
        int divisao50 = restoDivisao100 / 50;
        int restoDivisao50 = restoDivisao100 % 50;
        int divisao20 = restoDivisao50 / 20;
        int restoDivisao20 = restoDivisao50 % 20;
        int divisao10 = restoDivisao20 / 10;
        int restoDivisao10 = restoDivisao20 % 10;
        int divisao5 = restoDivisao10 / 5;
        int restoDivisao5 = restoDivisao10 % 5;
        int divisao2 = restoDivisao5 / 2;
        int restoDivisao2 = restoDivisao5 % 2;
        int divisao1 = restoDivisao2 / 1;

        System.out.println(valor);
        System.out.println(divisao100 + " nota(s) de R$ 100,00");
        System.out.println(divisao50 + " nota(s) de R$ 50,00");
        System.out.println(divisao20 + " nota(s) de R$ 20,00");
        System.out.println(divisao10 + " nota(s) de R$ 10,00");
        System.out.println(divisao5 + " nota(s) de R$ 5,00");
        System.out.println(divisao2 + " nota(s) de R$ 2,00");
        System.out.println(divisao1 + " nota(s) de R$ 1,00");
    }
}

/*
public class Cedulas {
    public static void main(String[] args) {
        int valor = 576;
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        for (int cedula : cedulas) {
            int quantidade = valor / cedula;
            valor %= cedula; // Atualiza o valor para o restante
            System.out.println(quantidade + " nota(s) de " + cedula);
        }
    }
}*/
