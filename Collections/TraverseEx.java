import java.util.*;

public class TraverseEx {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Cat");
        // ---------------- 1st method ---------------------

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        // ---------------- 2nd method ---------------------
        for (String value : animals) {
            System.out.println(value);
        }

    }
}
