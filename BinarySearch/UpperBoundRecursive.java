package BinarySearch;

public class UpperBoundRecursive {
    public static int display(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int upper = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                upper = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }
        return upper;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        int x = 2;
        System.out.println(display(arr, x));
    }
}
