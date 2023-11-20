package scanner;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double number;
        System.out.println("Wpisz liczbę nieujemną");
        while ((number = scanner.nextDouble()) >= 0) {
            sum += number;
            System.out.println("Suma wprowadzonych liczb: " + sum);
            System.out.println("Wpisz liczbę nieujemną");
        }
        System.out.println("Suma: " + sum);
    }
}
