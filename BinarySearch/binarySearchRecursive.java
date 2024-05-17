package BinarySearch;

public class binarySearchRecursive {
    public static int resursiveDisplay(int arr[], int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (value == arr[mid]) {
            return mid;
        } else if (value > arr[mid]) {
            return resursiveDisplay(arr, mid + 1, high, value);
        }

        return resursiveDisplay(arr, low, mid - 1, value);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 7, 9, 12, 16, 17 };
        System.out.print(resursiveDisplay(arr, 0, arr.length, 17));
    }

}
