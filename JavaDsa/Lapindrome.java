import java.util.*;

class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            minVal(1);
        }
    }

    static int minVal(int a) {
        int b = main.b();
        int c = main.c();
        if (a * b % c == 0) {
            return a;
        }
        minVal(a + 1);
    }
}
