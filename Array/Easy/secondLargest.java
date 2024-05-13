package Array.Easy;

public class secondLargest {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = { 9, 1, 8, 12, 2, 6 };
        display(arr);
    }

    public static void display(int arr[]) {
        int largest = 0;
        int secondLargest = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            if (smallest >= arr[i]) {
                // System.out.println("Largest item is : "+arr[i]);

                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Largest item is : " + largest);
        System.out.println("Second largest item is : " + secondLargest);

        System.out.println("Smallest item is : " + smallest);
        System.out.println("Second smallest item is : " + secondSmallest);

    }
}
