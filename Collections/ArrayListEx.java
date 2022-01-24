import java.util.*;

//java is type safe language so, we use the complex classes instead of the primitive datatypes.
class ArrayListEx {
    public static void main(String[] args) {
        ArrayList words = new ArrayList(); // array list created
        words.add("Rohith"); // adding to array as per index (order is important)
        words.add("Gangaraju");
        words.add("Love");
        words.add(180040625);
        words.add('k');

        String item1 = (String) words.get(0); // instead of string we can use object.As everything is object in java.
        String item2 = (String) words.get(4);
        System.out.println(item1 + item2);
    }

}