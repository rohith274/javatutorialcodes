package Zoo;

public class Animals {
    String name;
    int height;
    double weight;
    String color;

    public Animals(String name, int height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    void info() {
        System.out.println("Animal name is " + name);
        System.out.println("Height of the animal is " + height);
        System.out.println("weight of the animal is " + weight);
        System.out.println("color of the animal is " + color);
        // behavior are defined in class.
    }

    void canFly() {
        System.out.println(name);
        if (name == "parrot" || name == "eagle") {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    void canRun() {
        name = name.toLowerCase();
        if (name == "tortoise" || name == "turtle") {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
