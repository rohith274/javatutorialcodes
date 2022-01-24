public class Runnable1 {
    public static void main(String[] args) {
        System.out.println("Starting Thread 1");
        Thread t1 = new Thread(new Task("Thread-A"));
        t1.start();

        System.out.println("Starting Thread 2");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                // Thread.currentThread().setName(this.name);
                for (int i = 0; i < 1000; i++) {
                    System.out.println("number: " + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        t2.start();
    }
}

class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 1000; i++) {
            System.out.println("number: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
