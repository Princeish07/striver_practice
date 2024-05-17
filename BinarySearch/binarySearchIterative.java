package BinarySearch;

public class binarySearchIterative {

    static int display(int arr[], int value) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            System.out.println("Low" + low);
            System.out.println("high" + high);
            System.out.println("mid" + mid);
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 7, 9, 12, 16, 17 };
        if (display(arr, 17) == -1) {
            System.out.print("NO Value exist");
        } else {
            System.out.println(display(arr, 17));
        }
    }
}
