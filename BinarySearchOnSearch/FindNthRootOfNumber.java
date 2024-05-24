package BinarySearchOnSearch;

public class FindNthRootOfNumber {

    public static void display(int m, int n) {
        int finalAnswer = -1;
        for (int i = 1; i < m; i++) {
            int power = n;

            int result = 1;

            while (power != 0) {
                result *= i;
                power--;
            }

            if (result == m) {
                finalAnswer = i;
                break;
            }
        }
        System.out.println(finalAnswer);
    }

    public static void main(String[] args) {
        display(27, 3);
    }
}
