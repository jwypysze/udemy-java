package watki;

public class Czasoodmierzacz implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 15; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Something went wrong");
        }
    }
}
