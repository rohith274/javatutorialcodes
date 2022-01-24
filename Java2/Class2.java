public class Class2 {
    public int add2int(int n1, int n2) throws Exception {
        if (n1 == n2) {
            throw new Exception("BOTH ARE SAME NUMBERS");
        }

        return n1 + n2;

    }// we can create our own excpeion classes.
}
