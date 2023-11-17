package klasy.zadanie3;

public class Matma {

    public static final double PI = Math.PI;

    public static double obwodKola(double promienKola) {
        return 2 * PI * promienKola;
    }

    public static double poleKola(double promienKola) {
        return PI * Math.pow(promienKola, 2);
    }

    public static double obwodProstokata(double a, double b) {
        return 2 * (a + b);
    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }

    public static double sum(double... numbers) {
        double sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double avg(double... numbers) {
        double sum = sum(numbers);
        return sum / numbers.length;
    }

    public static double findMin(double... numbers) {
        double min = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double findMax(double... numbers) {
        double max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
