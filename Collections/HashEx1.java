import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashEx1 {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(10);
        values.add(12);
        values.add(16);
        values.add(43); // eventough we add it prints only unique
        for (Integer value : values) {
            System.out.println(value); // no duplicates printed
        }

        HashSet<String> Sentence = new HashSet<String>();
        Sentence.add("Rohith");
        Sentence.add("Rohith"); // from here below are ignored.
        Sentence.add("Rohith");
        Sentence.add("Rohith");
        Sentence.add("Rohith");
        // eventough we add it prints only unique
        for (String value : Sentence) {
            System.out.println(value); // no duplicates printed
        }

        LinkedHashSet<String> Sentence1 = new LinkedHashSet<String>();
        Sentence1.add("Rohith1");
        Sentence1.add("Rohith1"); // from here below are ignored.
        Sentence1.add("Hello");
        Sentence1.add("Hi");
        Sentence1.add("May be"); // cares about the order where as normal hashset includes order.
        // eventough we add it prints only unique
        for (String value : Sentence1) {
            System.out.println(value); // no duplicates printed
        }
    }
}
