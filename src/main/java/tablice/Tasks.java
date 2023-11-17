package tablice;

public class Tasks {

    public static void main(String[] args) {

        int[] tablica = new int[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;

        int sum = 0;
        for(int i = 0; i <= tablica.length - 1; i++) {
            sum += tablica[i];
        }
        System.out.println(sum);

        int sumAsPlus = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println(sumAsPlus);

        //tablica dwuwymiarowa

//        double[][] tablicaDwuwymiarowa = new double[3][5];
//        tablicaDwuwymiarowa[0][0] = 1.5;
//        tablicaDwuwymiarowa[0][1] = 2.6;
//        tablicaDwuwymiarowa[0][2] = 3.8;
//        tablicaDwuwymiarowa[0][3] = 4.9;
//        tablicaDwuwymiarowa[0][4] = 5.5;
//
//        tablicaDwuwymiarowa[1][0] = 1.8;
//        tablicaDwuwymiarowa[1][1] = 2.6;
//        tablicaDwuwymiarowa[1][2] = 3.5;
//        tablicaDwuwymiarowa[1][3] = 4.8;
//        tablicaDwuwymiarowa[1][4] = 5.6;
//
//        tablicaDwuwymiarowa[2][0] = 1.2;
//        tablicaDwuwymiarowa[2][1] = 2.3;
//        tablicaDwuwymiarowa[2][2] = 3.8;
//        tablicaDwuwymiarowa[2][3] = 4.6;
//        tablicaDwuwymiarowa[2][4] = 5.5;

        double[][] tablicaDwuwymiarowa = {
                {1.5, 2.6, 3.8, 4.9, 5.5},
                {1.8, 2.6, 3.5, 4.8, 5.6},
                {1.2, 2.3, 3.8, 4.6, 5.5}
        };

        double sumaWierszPierwszy = 0;
        double sumaWierszDrugi = 0;
        double sumaWierszTrzeci = 0;

        for (int i = 0; i < tablicaDwuwymiarowa[0].length; i++) {
            sumaWierszPierwszy += tablicaDwuwymiarowa[0][i];
        }

        for (int i = 0; i < tablicaDwuwymiarowa[1].length; i++) {
            sumaWierszDrugi += tablicaDwuwymiarowa[1][i];
        }

        for (int i = 0; i < tablicaDwuwymiarowa[2].length; i++) {
            sumaWierszTrzeci += tablicaDwuwymiarowa[2][i];
        }

        System.out.println("Suma wiersz pierwszy: " + sumaWierszPierwszy);
        System.out.println("Suma wiersz drugi: " + sumaWierszDrugi);
        System.out.println("Suma wiersz trzeci: " + sumaWierszTrzeci);



    }
}
