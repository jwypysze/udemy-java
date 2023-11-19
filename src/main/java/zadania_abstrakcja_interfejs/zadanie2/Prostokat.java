package zadania_abstrakcja_interfejs.zadanie2;

public class Prostokat implements Figury{

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return 2 * (this.a + this.b);
    }

    @Override
    public double pole() {
        return this.a * this.b;
    }
}
