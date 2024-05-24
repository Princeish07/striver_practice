package BinarySearchOnSearch;

/**
 * FindNthRootOfNumberWithBS
 */
public class FindNthRootOfNumberWithBS {

    public static void display(int m, int n) {
        int low = 1;
        int high = m - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int power = n;
            int result = 1;
            while (power != 0) {
                result *= mid;
                power--;
            }
            if (result == m) {
                ans = mid;
                break;
            } else if (result < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        display(69, 4);
    }
}