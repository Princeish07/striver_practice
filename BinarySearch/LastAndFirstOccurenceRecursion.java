package BinarySearch;

public class LastAndFirstOccurenceRecursion {
    static void displayFirst(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Targets Last Occurence Found at Index " + ans);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 13, 13, 13, 20, 40 };
        int x = 13;
        displayFirst(arr, x);
    }
}
