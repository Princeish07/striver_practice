package BinarySearch;

public class SearchInsertPositionIterative {
    public static void display(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print("Found at index" + i);
                break;
            } else if (arr[i] > target) {
                System.out.print("Item Not Found , it should at " + i + " position");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7 };
        int x = 2;
        display(arr, x);
    }
}
