
//for java and above
import java.util.*;

class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(); // array list created
        words.add("Rohith"); // adding to array as per index (order is important)
        words.add("Gangaraju");
        words.add("Love");

        words.add("k");

        String item1 = (String) words.get(0); // instead of string we can use object.As everything is object in java.
        String item2 = (String) words.get(3);
        System.out.println(item1 + item2);
    }

}