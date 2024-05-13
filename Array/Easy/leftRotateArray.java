package Array.Easy;

public class leftRotateArray {

    static void display(int arr[]) {
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i + 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        display(arr);
    }

}
