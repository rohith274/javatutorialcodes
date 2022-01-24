import java.util.ArrayList;

class GenericsEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Hello");
        list1.add(23);
        list1.add(true); // adding different data types.Anything is considered to be object rather than a
                         // datatype.
        String myval1 = (String) list1.get(0);
        String myval2 = (String) list1.get(1);// It is taking what we give or assign that object to be.
    }
}