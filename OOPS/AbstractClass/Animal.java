package AbstractClass;

public abstract class Animal {
    int age;
    String gender;
    int weight;

    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Eating.......");
    }

    void sleep() {
        System.out.println("sleeping......"); // sleeping is done by bird also. So, we make this class as parent class
                                              // of bird class
    }

    public abstract void move();
    // abstract class - gives idea animals move differently
    // abstarct class is only parent
    // Now animal class is olny parent.
    // here in this class there is no information about a movement

}
