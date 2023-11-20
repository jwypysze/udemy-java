package scanner;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");
        System.out.println("Wpisz tekst");
        String word;
        while (!(word = scanner.next()).toLowerCase().equals("x")) {
            System.out.println("Wpisany tekst: " + word);
        }
    }
}
