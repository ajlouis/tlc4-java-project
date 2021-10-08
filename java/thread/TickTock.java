package thread;

public class TickTock implements Runnable {
    private String word;
    private int delay;

    public TickTock(String w, int d) {
        word = w;
        delay = d;
    }


    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println(word + "");
                Thread.sleep(delay);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TickTock("tick", 5000));
        Thread t2 = new Thread(new TickTock("tock", 10000));
        t1.start();
        t2.start();

    }
}
