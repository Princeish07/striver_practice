package BinarySearch;

public class CountOccurence {
    static void display(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("Target Value " + x + " is occuring " + count + " times");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8;
        display(arr, x);

    }
}
