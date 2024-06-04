package desafiosDeSexta;

import java.util.Scanner;

public class Exercicio1049Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        String p3 = scanner.nextLine();

        if (p1.equals("vertebrado")) {
            if (p2.equals("ave")){
                if (p3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                if (p3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }
            if (p2.equals("mamifero")){
                if (p3.equals("onivoro")){
                    System.out.println("homem");
                }
                if (p3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
        if (p1.equals("invertebrado")) {
            if (p2.equals("inseto")){
                if (p3.equals("hematofago")){
                    System.out.println("pulga");
                }
                if (p3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }
            if (p2.equals("anelideo")){
                if (p3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                if (p3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}