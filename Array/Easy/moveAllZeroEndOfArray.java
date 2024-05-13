package Array.Easy;

/**
 * moveAllZeroEndOfArray
 */
public class moveAllZeroEndOfArray {

    static void display(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 0, 4, 0 };
        display(arr);

    }

}