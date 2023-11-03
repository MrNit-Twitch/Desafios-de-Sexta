package desafiosDeSexta;

import java.util.Scanner;

public class DecompondoPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        //Testando 1 2 3
        for (int cont = 1; cont <= num ; cont++){
            double div = num / cont;
            // %d substitui o primeiro parametro apos a virgula (d = inteiro / f = double / c = caractere / s = string)
            // No exemplo a baixo foi preciso fazer um CASTING para num, pois ele precisa ser mostrado como "int"
            System.out.printf("%d / %d = %.2f\n", (int) num , cont, div);
        }
        //Numero primo = numero natural que possua sómente 2 divisores 1 e ele mesmo.
    }
    private static boolean ePrimo (int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;

    }
}
