package Inhertitance;

public class Bird extends Animal// animal is super class
{// we should change the constrcutor because the creating of animal and bird
 // should be different.
 // hover to bird and add constructor

    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
        // basically all the inputs will be mapped here.
    }

    void fly() {
        System.out.println("Flying.....");
    }
}
