package Array.Easy;

public class LinearSearch {
    static void display(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.err.println(n + " is Present at index " + i);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 9, 12, 7 };
        display(arr, 9);
    }
}
