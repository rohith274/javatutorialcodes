package AbstractClass;

public class Bird extends Animal// animal is super class
{// we should change the constrcutor because the creating of animal and bird
 // should be different.
 // hover to bird and add constructor

    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
        // basically all the inputs will be mapped here.
    }

    @Override
    public void move() {
        System.out.println("Flapping wings.....");

    }

    // void fly() {
    // System.out.println("Flying.....");
    // }
    // without overriding we can implement interface by removing fly from here.
    // So, we will create interface. create with the .java extension
}
