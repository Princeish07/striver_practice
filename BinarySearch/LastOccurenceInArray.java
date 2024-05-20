package BinarySearch;

public class LastOccurenceInArray {
    static void display(int arr[], int x) {
        int lastOccurenceIndex = -1;
        int firstOccurenceIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastOccurenceIndex = i;
                if (firstOccurenceIndex == -1) {
                    firstOccurenceIndex = i;
                }
            }
        }
        if (lastOccurenceIndex == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Targets Last Occurence Found at Index " + lastOccurenceIndex);
        }
        if (firstOccurenceIndex == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Targets First Occurence Found at Index " + firstOccurenceIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 13, 13, 13, 20, 40 };
        int x = 13;
        display(arr, x);
    }
}
