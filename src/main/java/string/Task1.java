package string;

public class Task1 {

    public static void main(String[] args) {

        String name = "Joanna";
        String surname = "Wypyszewska";
        String nameSurname = "Joanna Wypyszewska";

        System.out.println("Ile znaków ma imię: " + name.length());
        System.out.println("Ile znaków ma nazwisko: " + surname.length());
        System.out.println("Ile znaków ma imię i nazwisko: " + nameSurname.length());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Czy moje imię jest równe Alicja? " + name.equals("Alicja"));
        System.out.println("Czy moje imię jest równe Jan? " + name.equals("Jan"));

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Nazwisko z wielkich liter: " + surname.toUpperCase());

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Zamiana 'a' na 'e': " + surname.replace('a', 'e'));


    }
}
