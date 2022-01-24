import java.util.ArrayList;
import java.util.List;

public class T4C1 {
    List<Thread4> sold = new ArrayList<>();
    List<Thread4> purchase = new ArrayList<>();

    public void populate() {
        for (int i = 0; i < 1000; i++) {
            Thread4 prod = new Thread4(i, "test_product " + i);
            sold.add(prod);
            System.out.println("Added: " + prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void display() {
        for (Thread4 thread4 : purchase) {
            System.out.println("Printing Sold: " + thread4);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
