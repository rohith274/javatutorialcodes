package HumanExample;

public class Earth {
    public static void main(String[] args) {
        // ClassExample tom = new ClassExample(); // instance variable. this is creating
        // object
        // // here tom is a object

        // tom.age = 5;
        // tom.eyeColor = "black";
        // tom.heightinInches = 72;
        // tom.name = "tom";
        // tom.speak();

        // ClassExample obj2 = new ClassExample();

        // obj2.name = "Rohith";
        // obj2.age = 19;
        // obj2.eyeColor = "slytherine";
        // obj2.heightinInches = 80;

        // obj2.work();

        // ClassExample obj3 = new ClassExample();
        // ClassExample obj4 = new ClassExample();
        // ClassExample obj5 = new ClassExample();
        // obj3.speak();
        // obj4.speak();
        // obj5.speak(); // these all speak same because we added the values in the
        // construcor on the
        // // classExample class.

        // -----------------------------
        // Eventhough out put is same execution is different
        ClassExample obj6 = new ClassExample("Rohith", 20, 80, "Black");
        obj6.speak();
        // ---------------------------

    }
}
