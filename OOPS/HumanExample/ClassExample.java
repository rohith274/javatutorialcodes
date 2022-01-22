package HumanExample;

public class ClassExample {

    String name;
    int age;
    int heightinInches;
    String eyeColor;

    public ClassExample() {
        // constructor method - same name as class name. No need to write but just this
        // looks like.
        // later
        /*
         * age = 5;
         * eyeColor = "black";
         * heightinInches = 72;
         * name = "tom";
         */
        // Now these values are prefilled.
        // to make this more dynamic like accessing a method. We can have seperate code

    }

    public ClassExample(String name, int age, int heightinInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightinInches = heightinInches;
        this.eyeColor = eyeColor; // rightclick out of the class and then click on source -> create constructor ->
                                  // select fields. Now these should be filled while calling the object in main
                                  // class
    }

    void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightinInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    void eat() {
        System.out.println("eating......");

    }

    void walk() {
        System.out.println("walking......");

    }

    void work() {
        System.out.println("working.......");
    }
}
