import java.util.ArrayList;

//methods to operate in list
class HashEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(4);
        obj.add(4);
        obj.add(4);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        // list1.addAll(list2) adds all data in list 2 to list1 indexing list 1 first
        obj.removeAll(list1); // remove data which is in list1 from obj
        // obj.clear(); // clear the list
        boolean a = list1.contains(1); // checks whether 1 is in list1
        System.out.println(a);
        boolean b = list1.isEmpty();
        System.out.println(b); // checks whether is empty
        // list1.retainAll(obj);// retains only values in obj and deletes all other
        // values in list1
        ArrayList<Integer> obj2 = new ArrayList<Integer>(obj); // import data from the argumented list.

        for (Integer v : obj2) {
            System.out.println(v);
        }
    }
}