package klasy.i.dziedziczenie.zadanie_dziedziczenie;

public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}
