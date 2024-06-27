package desafiosDeSexta;

import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1052Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> monthList = new ArrayList<>();
        int month = scanner.nextInt();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");

        System.out.println(monthList.get(month - 1));
        //System.out.println(Month.of(month).name());
    }
}
