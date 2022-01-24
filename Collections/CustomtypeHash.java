import java.util.HashSet;

public class CustomtypeHash {
    public static void main(String[] args) {
        HashSet<HashObject> obj = new HashSet<HashObject>();
        HashObject obj1 = new HashObject("Rohith", 20);
        HashObject obj2 = new HashObject("Vamsi", 22);
        HashObject obj3 = new HashObject("Keerthi", 21);
        HashObject obj4 = new HashObject("Rohith", 20);

        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4); // now hash set is printing both objects.

        System.out.println(obj1.equals(obj4)); // returning false. SO, we should change the default equals method.
        // ------------- these both are different ----------- if hash code is
        // uncommented.
        System.out.println(obj1.hashCode());
        System.out.println(obj4.hashCode());
        // ..... Now only unique are printed as property of the hashlist.
        for (HashObject value : obj) {
            System.out.println(value); // no duplicates printed
        }
    }
}
