
public class ReturnClass {
    public static void main(String[] args) {
        // main method is void return type.
        // So, returns nothing
        // In case of methods we need to return some type of data.
        // so, lets do that now.
        int a = method1(10, 100);
        System.out.println(method1(10, 100)); // print nothing if commented
    }

    static int method1(int i1, int i2) {
        return i1 + i2 + 4026;
        // printing is deifferent from return
        // return is capturing something from a method.
        // printing is deipalying to user.
    }

}
