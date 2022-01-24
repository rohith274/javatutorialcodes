
public class Thread3 {
    public static void main(String[] args) {
        // 1. syncing data is important
        Thread3c1 sequence = new Thread3c1();
        // for (int i = 0; i < 100; i++) {
        // System.out.println(sequence.getNext());
        Worker w1 = new Worker(sequence);
        Worker w2 = new Worker(sequence);
        w1.start();
        w2.start();

    }
}

class Worker extends Thread {
    Thread3c1 sequence = null;

    public Worker(Thread3c1 sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " got value : " + sequence.getNext());
        }

    }

}
