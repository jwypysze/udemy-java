package watki;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        });
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong!");;
        }
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }
        System.out.println();
        System.out.println("Zadanie 2");
        Thread thread2 = new Thread(new Czasoodmierzacz());
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }
        System.out.println();
        System.out.println("Zadanie 3");
        Thread thread3 = new Thread(new Watek1());
        Thread thread4 = new Thread(new Watek2());
        thread3.start();
        thread4.start();

    }
}
