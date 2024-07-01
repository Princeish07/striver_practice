package String.Medium;

public class Atoi {
    public static void display(String str1) {
        int index = 0;
        int sign = 1;
        while (str1.charAt(index) == ' ') {
            index++;
        }
        if (str1.charAt(index) == '-' || str1.charAt(index) == '+') {
            sign = str1.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        int res = 0;

        while (index < str1.length()) {
            if (!Character.isDigit(str1.charAt(index))) {
                res = -1;
                break;
            }
            int num = str1.charAt(index);
            index++;
            res = res * 10;
            res += (num - '0');

        }
        if (res == -1) {
            System.out.println(-1);
        } else {
            System.out.println(res * sign);
        }

    }

    public static void main(String[] args) {
        display(" -42b");

    }
}
