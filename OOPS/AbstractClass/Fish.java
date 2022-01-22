package AbstractClass;

public class Fish extends Bird {
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish is Swimming.....");

    }
}
