package AbstractClass;

public class Sparrow extends Bird implements FlyInterface {

    public Sparrow(int age, String gender, int weight) {
        super(age, gender, weight);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Flying......");

    }

}
