class Rec {
    public static void main(String[] args) {
        Rec main = new Rec();
        var result = main.sumofDigits(4);
        System.out.println(result);
    }

    public int sumofDigits(int n) {
        return n % 10 + sumofDigits(n / 10);
    }
}