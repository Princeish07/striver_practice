package BinarySearch;

public class SearchElementOccuringOnceRecursion {
    public static void display(int arr[]) {
        if (arr[0] != arr[1]) {
            System.out.println(arr[0]);
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1]);

        }

        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                System.out.println("Found at " + arr[mid]);
                break;
            } else if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 5, 5 };

        display(arr);
    }
}
