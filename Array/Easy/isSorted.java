package Array.Easy;

public class isSorted {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = { 9, 5, 1, 6, 7 };
        // int arr[] = {1,4,5,6,8};
        display(arr);
    }

    public static void display(int arr[]) {
        int prev = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (prev > arr[i]) {
                count--;
                break;
            } else {
                count++;
            }
        }
        if (count == arr.length - 1) {
            System.out.print("Sorted Array");
        } else {
            System.out.print("No Sorted Array");
        }
    }
}
