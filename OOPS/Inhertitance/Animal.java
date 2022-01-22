package Inhertitance;

public class Animal {
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
}
