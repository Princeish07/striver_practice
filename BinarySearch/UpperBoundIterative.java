package BinarySearch;

public class UpperBoundIterative {
    public static void display(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                System.out.println(i);
                break;

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        int x = 2;
        display(arr, x);
    }
}
