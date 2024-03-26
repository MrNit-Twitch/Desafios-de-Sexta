package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1045TiposDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(a <= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (a*2 == b*2 + c*2){
            System.out.println("TRIANGULO RETANGULO");
        } else if (a*2 > b*2 + c*2) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a*2 < b*2 + c*2) {
            System.out.println("TRIANGULO ACUTANGULO");
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }

        if (a == b && b == c & c == a){
            System.out.println("TRIANGULO EQUILATERO");
        } else {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

}
