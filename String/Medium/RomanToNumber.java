package String.Medium;

/**
 * RomanToNumber
 */
public class RomanToNumber {
    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static void display(String str) {
        int number = value(str.charAt(1)) - value(str.charAt(0));
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            int num1 = value(str.charAt(i));

            if (i + 1 < str.length()) {
                int num2 = value(str.charAt(i + 1));
                if (num1 >= num2) {
                    res += num1;
                } else {
                    res += num2 - num1;
                    i++;
                }
            } else {
                res += num1;
            }

        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        display("MCMIV");

    }
}