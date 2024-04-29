package Sorting;

public class SelectionSort {
    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int arr[] = { 2, 2, 1, 6, 3, 1 };
        selectionSort.display(arr);
    }
}
