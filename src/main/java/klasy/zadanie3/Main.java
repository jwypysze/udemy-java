package klasy.zadanie3;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Obwód koła: " + Matma.obwodKola(-5));
        } catch (LiczbaUjemnaException e) {
            System.out.println("Promień koła nie może być ujemny!");
        }
        System.out.println("Pole koła: " + Matma.poleKola(5));
        System.out.println("Obwód prostokąta: " + Matma.obwodProstokata(4, 5));
        System.out.println("Pole prostokąta: " + Matma.poleProstokata(5, 3));
        System.out.println("Suma: " + Matma.sum(5, 6, 11));
        System.out.println("Średnia: " + Matma.avg(5, 5, 1, 9));
        System.out.println("Minimum: " + Matma.findMin(4, 5, 8, 11));
        System.out.println("Max: " + Matma.findMax(4, 5, 8, 11));


    }
}
