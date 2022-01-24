import java.util.ArrayList;
import java.util.List;

public class CustomType {
    public static void main(String[] args) {
        // defaults size is 10 for arraylist;
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(5);// declarng size to 5
        vehicles.add(new Vehicle("honda", "accord", 1200, false)); // creating directly
        // we can also do the same thing in another way.
        Vehicle vehicle2 = new Vehicle("Hero", "Glamour", 122222, false);
        vehicles.add(vehicle2);
        // ------------------ 1st method -------------
        // for (Vehicle v : vehicles) {
        // System.out.println(v.getMake());
        // System.out.println(v.getModel());
        // System.out.println(v.getPrice());

        // }
        // ------------------ 2nd method -------------

        for (Vehicle v : vehicles) {
            System.out.println(v);
            // changing hash to string in the vehicle class (toString in source action )
        }
        printElements(vehicles);

    }

    public static void printElements(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.err.println(someList.get(i));
        }
    }

}
