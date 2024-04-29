package Hashing;

public class NumberFrequencyWithArray {

    static void display(int n, int arr[]) {
        int updatedArr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {

            updatedArr[arr[i]]++;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(updatedArr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 1, 2, 12 };
        display(13, arr);

    }

}
