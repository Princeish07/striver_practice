package BinarySearchOnSearch;

public class FindSqrt {
    public static void display(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        display(36);
    }
}
