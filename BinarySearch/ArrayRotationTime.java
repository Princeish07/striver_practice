package BinarySearch;

public class ArrayRotationTime {

    static void display(int arr[]) {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;

            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        display(arr);
    }
}
