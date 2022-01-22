public class WhileLoop {
    // used to execute several times till the condition is met
    // used to automate things
    public static void main(String[] args) {
        int a = 10; // breakpoint
        // if we press continue then it goes to next either it waits till command.
        // we can examine everything in java debug with the change in variable and code
        while (a-- > 0) {
            System.out.println(a);
        } // run till the condition
        while (a++ < 100) {
            System.out.println(a % 10);
            break;
        }
    }
}
