package scanner;


import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.reset();
        System.out.println("Wpisz linię tekstu");
        String line = scanner.nextLine();
        System.out.println("Wpisz liczbę");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(line);
        }
    }
}
