//multithreading
class Thread1 {
    public static void main(String[] args) {
        // 1.first tread in java program
        Task taskRunner = new Task();
        taskRunner.start();
        // 5. new thread is found above. Now java dont wait. It just splits to other
        // thread.
        System.out.println("Hello there..."); // 2.we started a thread.
        // 3.Java is executing line by line.But multi lnes should run at same time.
        // taskRunner.start();6. if we run this gives excpetion.It is not legal to start
        // same thread twice. We can create new instance instead.
        Task taskRunner2 = new Task();
        taskRunner2.start();// 3rd thread is started so, output will be mixed up.As java dont wait for line
                            // by line compilation.
    }
}

class Task extends Thread {
    // 4 has its verison of run which executes on other thread.
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("number: " + i);
        }
    }
}
