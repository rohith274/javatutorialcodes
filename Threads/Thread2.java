public class Thread2 {
    public static void main(String[] args) {
        System.out.println("Starting Thread 1");
        Task taskRunner = new Task();
        taskRunner.start();

        System.out.println("Starting Thread 2");

        Task taskRunner2 = new Task();
        taskRunner2.start();
    }
}

class Task extends Thread {

    public void run() {
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
