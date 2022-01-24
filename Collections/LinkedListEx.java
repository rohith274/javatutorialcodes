import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>(); // we cannot assign primitive datatypes in angled
                                                                 // brackets. There is no class for(int). So, we use
        numbers.add(100); // complex classess like Integer in bracket
        numbers.add(50);
        numbers.add(25);// attached at last of the link.
        numbers.add(1000);
        numbers.remove(2);// index position
        numbers.removeFirst();
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
