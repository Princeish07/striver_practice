public class Palindrom {
    static boolean displayIsPalindrom(int n) {
        int i = n;
        int reverse = 0;
        while (i > 0) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
            i = i / 10;
        }
        return n == reverse;
    }

    public static void main(String[] args) {
        System.out.print(displayIsPalindrom(313));
    }
}
