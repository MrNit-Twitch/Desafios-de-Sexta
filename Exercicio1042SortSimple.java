package desafiosDeSexta;

import com.sun.jdi.Value;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1042SortSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int menor;
        int medio;
        int maior;

        if (n1 < n2 && n1 < n3 && n2 < n3) {
            menor = n1;
            medio = n2;
            maior = n3;
        } else if (n1 < n2 && n1 < n3 && n3 < n2) {
            menor = n1;
            medio = n3;
            maior = n2;
        } else if (n2 < n1 && n2 < n3 && n1 < n3) {
            menor = n2;
            medio = n1;
            maior = n3;
        } else if (n2 < n1 && n2 < n3 && n3 < n1) {
            menor = n2;
            medio = n3;
            maior = n1;
        } else if (n3 < n1 && n3 < n2 && n1 < n2) {
            menor = n3;
            medio = n1;
            maior = n2;
        } else {
            menor = n3;
            medio = n2;
            maior = n1;
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
