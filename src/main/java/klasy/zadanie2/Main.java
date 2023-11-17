package klasy.zadanie2;

public class Main {

    public static void main(String[] args) {

        Klasa klasa = new Klasa(new int[] {5, 6, 4, 6, 9});
        System.out.println("Suma: " + klasa.sum());
        System.out.println("Średnia: " + klasa.avg());
        System.out.println("Minimum: " + klasa.findMinimum());
        System.out.println("Maksimum: " + klasa.findMaximum());
    }
}
