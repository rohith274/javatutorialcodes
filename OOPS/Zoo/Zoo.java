package Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animals parrot = new Animals("parrot", 1, 1.5, "green");
        parrot.info();
        parrot.canFly();
        parrot.canRun();

    }
}
