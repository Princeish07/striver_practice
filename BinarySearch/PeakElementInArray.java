package BinarySearch;

public class PeakElementInArray {
    public static void display(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                System.out.println("Peak at " + arr[mid]);

            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        display(arr);
    }
}
