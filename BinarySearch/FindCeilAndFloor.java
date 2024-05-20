package BinarySearch;

/**
 * FindCeilAndFloor
 */
public class FindCeilAndFloor {
    public static int displayCeil(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else if (arr[mid] <= x) {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int displayFloor(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else if (arr[mid] >= x) {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int x = 8;
        System.out.println("Ciel of " + x + " is " + displayCeil(arr, x));
        System.out.print("Floor of " + x + " is " + displayFloor(arr, x));
        System.out.println();

    }
}