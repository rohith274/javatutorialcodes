package Inhertitance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();
        Bird bird1 = new Bird(12, "F", 26); // we cannot create bird normally as inherted all the variables from parent
        // class
        bird1.fly();
        bird1.eat();
        bird1.sleep();

        // Now all the methods in parent class can be accessble by child.
        // but not vice versa
        // reference variable created along with the class (parent) then only those
        // methods can be visible.
        // for the reference variable with child class can access both the methods in
        // both classes.

        Fish fish1 = new Fish(13, "F", 30);
        fish1.eat(); // now fish is extended to both classes

    }
}
