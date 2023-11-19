package zadania_abstrakcja_interfejs.zadanie2;

public class Main {

    public static void main(String[] args) {
        Figury kolo = new Kolo(2);
        System.out.println("Pole koła: " + kolo.pole());
        System.out.println("Obwód koła: " + kolo.obwod());
        Figury prostokat = new Prostokat(3, 5);
        System.out.println("Pole prostokąta: " + prostokat.pole());
        System.out.println("Obwód prostokąta: " + prostokat.obwod());
    }

}
