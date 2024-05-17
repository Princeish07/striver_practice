package BinarySearch;

public class SearchInsertPositionRecursive {
    static int display(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Item found at index " + mid);
                break;
            } else if (arr[mid] > target) {
                index = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7 };
        int x = 2;
        System.out.println(display(arr, x));

    }

}
