package watki;

public class Czasoodmierzacz implements Runnable{
    @Override
    public void run() {
        int time = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong");
            }
            time++;
            System.out.println("Minęło " + time + " sek");
        }
    }
}
