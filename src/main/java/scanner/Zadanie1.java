package scanner;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię");
        String name = scanner.nextLine();
        System.out.println("Wpisz nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Wpisz wzrost");
        double height = scanner.nextDouble();
        System.out.println("Jestem " + name + " " + surname + " i mam " + height + " cm wzrostu.");
    }
}
