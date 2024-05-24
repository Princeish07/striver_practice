package BinarySearch;

public class PeakElementInArrayWithIteration {
    public static void display(int arr[]) {
        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        display(arr);
    }
}
