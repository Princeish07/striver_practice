package BinarySearch;

public class LowerBoundIterative {
    public static void display(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 15, 19 };

        display(arr, 9);
    }
}
