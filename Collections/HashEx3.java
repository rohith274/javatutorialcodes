import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class HashEx3 {
    public static void main(String[] args) {
        HashSet<String> Sentence = new HashSet<String>();
        Sentence.add("Rohith");
        Sentence.add("Vijay"); // from here below are ignored.
        Sentence.add("Keerthi");
        Sentence.add("Ruthvik");
        Sentence.add("Rohith");
        // eventough we add it prints only unique
        ArrayList<String> list1 = new ArrayList<String>(Sentence);
        Collections.sort(list1);
        System.out.println(list1);
        // we can also intialize a other class and access the elements from there. And
        // this works same.
        // Tips to get the work done when other user defined calsses are used.
        // we should extend the user defined class with the implements comparable<class
        // name> interface
    }
}
