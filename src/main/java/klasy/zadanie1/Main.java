package klasy.zadanie1;

public class Main {

    public static void main(String[] args) {

        Programista programista = new Programista("Joanna", "Wypyszewska", "polski", 10000.55);
        System.out.println("Imię: " + programista.getName());
        System.out.println("Nazwisko: " + programista.getSurname());
        System.out.println("Język: " + programista.getLanguage());
        System.out.println("Wynagrodzenie: " + programista.getSalary());

    }
}
