package watki;

public class Watek1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Będę pierwszy - to ja Wątek1");
        }
        System.out.println("ZAKOŃCZYŁEM! Melduje się Wątek1");
    }
}
