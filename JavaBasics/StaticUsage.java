
public class StaticUsage {
    public static void main(String[] args) {
        // cannot be used as non static method6();
        StaticUsage myVar;
        myVar = new StaticUsage();
        myVar.method6(); // non static way to access
        // here it is called instance

    }

    void method6() {
        System.out.println("Hi! you are in method 6");
        // if static is removed then we cannot invoke this method in any class! by just
        // StaticUsage.method6()
        // including this StaticUsage class
    }
}
