package Recursion;

public class ReverseArray {
    void display(int newArr[], int arr[], int index) {
        if (index == newArr.length) {
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }
            return;
        }
        newArr[index] = arr[index];
        index++;
        display(newArr, arr, index);

    }

    public static void displayWithoutUsingNewArray(int arr[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            displayWithoutUsingNewArray(arr, startIndex + 1, endIndex--);
        }

    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newArray = new int[intArray.length];
        reverseArray.displayWithoutUsingNewArray(newArray, 0, intArray.length - 1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
