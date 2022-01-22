public class StringsLearn {
    // charecters in string are associated with a index number from 0 to n-1
    public static void main(String[] args) {
        String str = "Rohith"; // assigning a string
        int len = str.length(); // length of a string
        String str1 = str.substring(1, 5); // catch part of a string
        System.out.println(len + str1); // print the substring
        // if loop string
        // ----------------- (Works! but should not compare or use)----------------
        String name = "Vijay"; // wrong method
        if (name == "Rohith") {// wrong method
            System.out.println("Hello! Rohith");// wrong method
        } else {
            System.out.println("Hello! " + name);// wrong method
        }
        // ------------------------------------------------------------------------
        // As string is a object there may be issue in higher level coding.
        // So we should use a method for that
        if (name.equals("Rohith")) {
            System.out.println("This is correct method");
        } else if (name.equalsIgnoreCase("Vijay")) {
            System.out.println("Correct method");
        } else {
            System.out.println("Method is correct but you are not rohith!");
        }
        // ------------------------------------------------------------------------
        // case changing
        str1 = str1.toLowerCase();
        str1 = str1.toUpperCase();
        // ------------------------------------------------------------------------
        char x1 = str.charAt(1);
        System.out.println(x1);
        // if not there - > out of bounds gives out of range
        String sentence = "Hello! I am I Rohith";
        int a = sentence.lastIndexOf("I");
        int b = sentence.indexOf("I");

        System.out.println(a);
        System.out.println(b);
    }
}
