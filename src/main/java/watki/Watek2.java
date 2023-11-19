package watki;

public class Watek2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Będę pierwszy - to ja Wątek2");
        }
        System.out.println("ZAKOŃCZYŁEM! Melduje się Wątek2");
    }
}
