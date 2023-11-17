package klasy.zadanie2;

public class Klasa {

    private int[] numbers;

    public Klasa(int[] numbers) {
        this.numbers = numbers;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int avg() {
        int sum = this.sum();
        return sum / numbers.length;
    }

    public int findMinimum() {
        int min = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int findMaximum() {
        int max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
