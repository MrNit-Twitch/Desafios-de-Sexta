package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1021NotasEMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorTotal = scanner.nextFloat(); //576,73

        float notasDeCem = valorTotal / 100;
        float restoDeCem = valorTotal % 100;
        float notasDeCinquenta = restoDeCem / 50;
        float restoDeCinquenta = restoDeCem % 50;
        float notasDeVinte = restoDeCinquenta / 20;
        float restoDeVinte = restoDeCinquenta % 20;
        float notasDeDez = restoDeVinte / 10;
        float restoDeDez = restoDeVinte % 10;
        float notasDeCinco = restoDeDez / 5;
        float restoDeCinco = restoDeDez % 5;
        float notasDeDois = restoDeCinco / 2;
        float restoDeDois = restoDeCinco % 2;

        float moedaDeUmR = restoDeDois / 1;
        float restoDeUmR = restoDeDois % 1;
        double moedaDeCinquentaC = restoDeUmR / 0.50;
        double restoDeCinquentaC = restoDeUmR % 0.50;
        double moedaDeVinteECincoC = restoDeCinquentaC / 0.25;
        double restoDeVinteECincoC = restoDeCinquentaC % 0.25;
        double moedaDeDezC = restoDeVinteECincoC / 0.10;
        double restoDeDezC = restoDeVinteECincoC % 0.10;
        double moedaDeCincoC = restoDeDezC / 0.05;
        double restoDeCincoC = restoDeDezC % 0.05;
        double moedaDeUmC = Math.round(restoDeCincoC / 0.01);

        System.out.println("NOTAS:");
        System.out.println(((int) notasDeCem) + " nota(s) de R$ 100.00");
        System.out.println(((int) notasDeCinquenta) + " nota(s) de R$ 50.00");
        System.out.println(((int) notasDeVinte) + " nota(s) de R$ 20.00");
        System.out.println(((int) notasDeDez) + " nota(s) de R$ 10.00");
        System.out.println(((int) notasDeCinco) + " nota(s) de R$ 5.00");
        System.out.println(((int) notasDeDois) + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(((int) moedaDeUmR) + " moeda(s) de R$ 1.00");
        System.out.println(((int) moedaDeCinquentaC) + " moeda(s) de R$ 0.50");
        System.out.println(((int) moedaDeVinteECincoC) + " moeda(s) de R$ 0.25");
        System.out.println(((int) moedaDeDezC) + " moeda(s) de R$ 0.10");
        System.out.println(((int) moedaDeCincoC) + " moeda(s) de R$ 0.05");
        System.out.println(((int) moedaDeUmC) + " moeda(s) de R$ 0.01");
    }
}
