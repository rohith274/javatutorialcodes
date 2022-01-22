package JavaBasics;

public class Array {
    public static void main(String[] args) {
        // for storing some range of variables
        int z;
        z = 100; // I cannot give more than value here.

        int[] values = new int[5]; // LHS : array name , RHS : array type and length of array
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;
        values[4] = 5; // array start from 0 and n-1 if n is length.
        System.out.println(values[3]);// print at 3 index and 4th slot in array
        // must give of same data type.
        // It gves array out of bound if the integerin the index of print is more than
        // (n-1)

    }
}
