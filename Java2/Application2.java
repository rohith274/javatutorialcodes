class Myclass implements AutoCloseable {

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Closing!");
    }

}

public class Application2 {
    public static void main(String[] args) {
        try (Myclass var = new Myclass()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
        // finally block is not needed after java 7 and try has some arguments!

    }
}