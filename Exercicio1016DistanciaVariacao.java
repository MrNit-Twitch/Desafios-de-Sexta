package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1016DistanciaVariacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a velocidade do veículo 1");
        int carro1 = scanner.nextInt();
        System.out.println("Insira a velocidade do veículo 2");
        int carro2 = scanner.nextInt();
        int diferenca = 0;

        if (carro1 > carro2) {
            diferenca = carro1 - carro2;
            int calculo = diferenca * 2;
            System.out.println("O veículo 2 esta a " + diferenca + " minutos de distância do veículo 1");
        } else {
            diferenca = carro2 - carro1;
            int calculo = diferenca * 2;
            System.out.println("O veículo 1 esta a " + diferenca + " minutos de distância do veículo 2");
        }
    }
}
