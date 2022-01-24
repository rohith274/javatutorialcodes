import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> dictionary = new LinkedHashMap<Integer, String>();
        dictionary.put(1, "Rohith");// linked hasmap
        dictionary.put(2, "keerthi");
        dictionary.put(3, "vamsi");
        dictionary.put(4, "Ruthvik");
        for (Integer word : dictionary.keySet()) {
            System.out.println(dictionary.get(word));
        } // only keys if keyset and value saet gives only values

        for (Map.Entry<Integer, String> word : dictionary.entrySet()) {
            System.out.println(word.getKey());
            System.out.println(word.getValue());
            // both values and keys
        } //
    }
}
