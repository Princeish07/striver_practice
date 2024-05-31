package String_Basic;

public class LargestOddNumber {

    public static String display(String s) {
        int maxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int value = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (value % 2 != 0) {
                if (value > maxOdd) {
                    maxOdd = Integer.parseInt(s.substring(0, i + 1));

                }
            }
        }
        if (maxOdd == -2147483648) {
            return "";
        } else {
            return String.valueOf(maxOdd);
        }

    }

    public static void main(String[] args) {
        System.out.print(display("5267321"));
    }
}
