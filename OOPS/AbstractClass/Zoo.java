package AbstractClass;

public class Zoo {
    public static void main(String[] args) {
        // Animal animal1 = new Animal(12, "M", 23);
        // animal1.eat();
        // Bird bird1 = new Bird(12, "F", 26); // we cannot create bird normally as
        // inherted all the variables from parent
        // // class
        // bird1.fly();
        // bird1.eat();
        // bird1.sleep();

        // Chicken chick1 = new Chicken(12, "F", 35);
        // // chick1.fly(); // we will import all the methods from
        // Sparrow sp1 = new Sparrow(10, "M", 1);
        Fish fish1 = new Fish(10, "f", 2);
        moveAnimals(fish1);
    }

    public static void moveAnimals(Animal animal) {
        animal.move();

    }

}
