package klasy.i.dziedziczenie.zadanie_dziedziczenie;

public class Pracownik extends Osoba {

    private String stanowisko;
    private String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println(" i pracuję w firmie " + nazwaFirmy + " na stanowisku " + stanowisko);
    }
}
