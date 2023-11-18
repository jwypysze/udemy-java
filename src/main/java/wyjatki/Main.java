package wyjatki;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println("a/b = " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }

    }

}
