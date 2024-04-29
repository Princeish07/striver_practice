public class ReverseDigit {

    void displayReverseValue(int n) {
        int value = n;
        int reverse = 0;
        while (value > 0) {
            int remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value = value / 10;
        }

        System.out.print(reverse);
    }

    public static void main(String[] args) {
        ReverseDigit reverseDigit = new ReverseDigit();
        reverseDigit.displayReverseValue(9912);

    }
}
