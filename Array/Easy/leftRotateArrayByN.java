package Array.Easy;

public class leftRotateArrayByN {

    static void display(int arr[], int n) {
        int d = n % arr.length;

        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        int index = 0;
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[index];
            index++;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        display(arr, 11);
    }

}
