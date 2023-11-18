package wyjatki;

public class MainTask2 {

    public static void main(String[] args) {
        try {
            System.out.println("Wynik: " + podziel(6, 0));
        } catch (DoNotDivideByZeroException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }
    }

    public static int podziel(int a, int b) throws DoNotDivideByZeroException {
        if (b == 0) {
            throw new DoNotDivideByZeroException();
        }
        return a/b;
    }
}
