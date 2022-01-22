package Interfaces;

public class Chicken extends Bird {
    public Chicken(int age, String gender, int weight) {
        super(age, gender, weight);
        // TODO Auto-generated constructor stub
    }

    void fly() {
        System.out.println("Unable to fly...");
    }
    // we can override the inheritance.
}
