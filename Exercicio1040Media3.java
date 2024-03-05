package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1040Media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        double media = (n1*2 + n2*3 + n3*4 + n4) / 10;
        System.out.printf("Media: %.1f\n" , media);
        if (media >= 7){
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double ne = scanner.nextDouble();
            System.out.println("Nota do exame: " + ne);
            double mediaFinal = (media + ne)/2;
            if (mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
    }
}
