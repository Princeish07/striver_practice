package BinarySearch;

public class SearchElementOccuringOnce {

    public static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    System.out.println("Found at " + arr[i]);
                    break;
                }
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    System.out.println("Found at " + arr[i]);
                    break;
                }
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    System.out.println("Found at " + arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 5, 5 };
        display(arr);

    }
}
