package desafiosDeSexta;

public class Exercicio1021NotasEMoedasAlternativas {}

 /*   Camaliel:=====
    PRIMEIRO CODIGO =====import java.text.DecimalFormat; import java.util.Scanner;

    public class NotasEMoedas1021 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double valorTotal = leia.nextDouble();
            DecimalFormat format = new DecimalFormat("0");
            DecimalFormat format2 = new DecimalFormat("0.00");
            double divide = 0;
            double[] notas = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
            double[] moed

            SEGUNDO CODIGO === import java.text.DecimalFormat; import java.util.Locale; import
            java.util.Scanner;
            public class Main {
                public static void main(String[] args) {
                    Locale.setDefault(Locale.US);
                    Scanner leia = new Scanner(System.in);
                    double valorTotal = leia.nextDouble();
                    int centavos = (int) Math.round(valorTotal * 100); // TODO Converter para centavos DecimalFormat format = new DecimalFormat("0"); DecimalFormat format2 = new D
                }

                otallyto: https://gist.github.com/tallyto/497a1cf53018706d9a451a9c31979a32

                public class Ex1035 {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        String input = scanner.nextLine();
                        var inputs = Arrays.stream(input.split(" ")).map(
                                Integer::parseInt
                        ).collect(Collectors.toList());

                        var somaCD = inputs.get(2) + inputs.get(3);
                        var somaAB = inputs.get(0) + inputs.get(1);

                        if ((inputs.get(1) > inputs.get(2)) &&
                                (inputs.get(3) > inputs.get(0)) &&
                                (somaCD > somaAB) &&
                                (inputs.get(2) > 0 && inputs.get(3) > 0) &&
                                (inputs.get(0) % 2 == 0)
                        ) {
                            System.out.println("Valores aceitos");
                        } else {
                            System.out.println("Valores nao aceitos");
                        }

                    }
                }*/