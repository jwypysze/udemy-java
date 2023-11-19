package zadania_abstrakcja_interfejs.zadanie2;

public class Kolo implements Figury{

    private double promienKola;

    public Kolo(double promienKola) {
        this.promienKola = promienKola;
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * this.promienKola;
    }

    @Override
    public double pole() {
        return Math.PI * Math.pow(this.promienKola, 2);
    }
}
