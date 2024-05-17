package BinarySearch;

public class LowerBoundRecursive {
    public static int display(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        if (low > high) {
            return -1;
        }
        int ans = arr.length;
        while (low <= high) {

            {
                int mid = (low + high) / 2;
                if (arr[mid] >= target) {
                    ans = mid;
                    high = mid - 1;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };

        System.out.print(display(arr, 2));

    }

}
