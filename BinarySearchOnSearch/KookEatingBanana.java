package BinarySearchOnSearch;

public class KookEatingBanana {

    public static int maxElement(int arr[]) {
        int largestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

    public static int calculateSum(int arr[], int divisble) {
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += Math.ceil((double) arr[j] / (double) divisble);
        }
        return sum;
    }

    public static void display(int arr[], int h) {
        int maxElement = maxElement(arr);
        for (int i = 1; i <= maxElement; i++) {
            int totalHrs = calculateSum(arr, i);

            if (totalHrs <= h) {
                System.out.println(i);
                break;

            }
        }

    }

    public static void displayBS(int arr[], int h) {
        int low = 1;
        int high = maxElement(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateSum(arr, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        System.out.print(low);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        display(arr, 8);
    }
}
