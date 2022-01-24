
class T4Application {
    public static void main(String[] args) throws InterruptedException {
        T4C1 t4c1 = new T4C1();
        Thread inverntoryTask = new Thread(new Runnable() {
            public void run() {
                t4c1.populate();
            }
        });
        Thread displayTask = new Thread(new Runnable() {
            public void run() {
                t4c1.display();
            }
        });
        inverntoryTask.start();
        Thread.sleep(2000);
        displayTask.start();
    }
}