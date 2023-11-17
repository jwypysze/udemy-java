package pętle;

public class Tasks {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Zadanie 1");
        System.out.println("Liczby od 0 do 30:");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Liczby od 30 do 0:");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }

        // Task 2
        System.out.println();
        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println("Liczby parzyste od 0 do 30:");
        for (int i = 0; i <= 30; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");
            }
        }

        // LEPSZY SPOSÓB !!!
        System.out.println();
        System.out.println("Lepszy sposób");

        for (int i = 0; i <= 30; i = i + 2) {
            System.out.print(i + " ");
        }

        // Task 3
        System.out.println();
        System.out.println();
        System.out.println("Zadanie 3");
        int a = 5;
        int b = 13;
        System.out.println("Liczby od " + a + " do " + b);
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }

        // Task 4
        System.out.println();
        System.out.println();
        int[] tab = {5,8,6,1,9,8,5,9,7,5};
        System.out.println("Zadanie 4");
        System.out.println("Elementy tablicy od przodu:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Elementy tablicy od tyłu:");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }

        // Task 5
        System.out.println();
        System.out.println();
        System.out.println("Zadanie 5");
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("Suma elementów tablicy: " + sum);

        // Task 6
        System.out.println();
        System.out.println("Zadanie 6");
        int number = 5;
        if (number >= 0 ) {
            long result = 1L;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Silnia liczby " + number + ": " + result);
        } else {
            System.err.println("Liczba jest ujemna");
        }

        // Task 7
        System.out.println();
        System.out.println("Zadanie 7");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 8
        System.out.println();
        System.out.println("Zadanie 8");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Task 9
        System.out.println();
        System.out.println();
        System.out.println("Zadanie 9");

        int m = 5;
        int ileGalezi = 3;
        for (int x = 1; x <= ileGalezi; x++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2 * m; j++) {
                    if (j < (m - i) || j > (m + i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }



    }
}
