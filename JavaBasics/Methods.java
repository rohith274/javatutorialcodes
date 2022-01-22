
public class Methods {
    public static void main(String[] args) {
        // system.out.println ==> system(out(print())) print is a method which lies
        // inside out class and system class
        // we can create own methods so, code will be very easy to understand
        // we are now in main method
        // I should call a method from main to get the method in execution.
        method1();// caling method 1 with no arguments.
        method2("You are in method 2"); // calling method 2 with string argument. Same way you can go for any type of
        // args.
        add(4, 6);
        add("hello", "madam");
        // you can create same name methods with two different argument types
        // java know to call correct method.
        // now lets see to use classes in side other class

        NestedClass.sub(10, 6);// use method from other class if it s public
    }

    public static void method1() {
        System.out.println("You are in method 1, I dont need arguments");
        // now you are in method 1 created by you.
    }

    public static void method2(String s1) {
        System.out.println(s1);

    }

    // sum of integers method
    public static void add(int i1, int i2) {
        int sum = i1 + i2;
        System.out.println(sum);
    }

    public static void add(String i1, String i2) {
        String sum = i1 + i2;
        System.out.println(sum);
    }

}
