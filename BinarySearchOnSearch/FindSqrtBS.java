package BinarySearchOnSearch;

public class FindSqrtBS {
    public static void display(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        System.out.println(high);

    }

    public static void main(String[] args) {
        display(28);
    }
}
