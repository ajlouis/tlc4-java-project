package thread;

public class TickTock2 extends Thread {
    private String word;
    private int delay;

    public TickTock2(String w, int d) {
        word = w;
        delay = d;
    }

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
        TickTock2 tt1 = new TickTock2("tick", 50);
        TickTock2 tt2 = new TickTock2("tick", 50);
        tt1.start();
        tt2.start();
    }

}
