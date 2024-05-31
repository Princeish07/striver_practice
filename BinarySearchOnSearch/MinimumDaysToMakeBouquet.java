package BinarySearchOnSearch;

public class MinimumDaysToMakeBouquet {

    public static int display(int arr[], int m, int k, int day) {
        int count = 0;
        int bouquetCount = 0;
        int AcheivedDay = 0;
        for (int i = 0; i < arr.length; i++) {

            if (day >= arr[i]) {

                // if (count < m) {
                count++;
                // }
                if (count > m) {
                    count = 0;
                }
                if (count == m) {

                    bouquetCount++;

                }

            } else {
                count = 0;
            }
        }
        if (bouquetCount == k) {

            System.out.println("" + day);
            AcheivedDay = day;

        } else {
        }

        return AcheivedDay;

    }

    public static void findMinAndMax(int arr[], int m, int k) {
        int minimumNumber = arr[0];
        int maxNumber = arr[0];
        int prevDay = Integer.MAX_VALUE;
        ;
        for (int i = 0; i < arr.length; i++) {
            if (minimumNumber > arr[i]) {
                minimumNumber = arr[i];
            }

            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }

        for (int i = minimumNumber; i <= maxNumber; i++) {
            int currentDay = display(arr, m, k, i);

            if (prevDay > currentDay && currentDay != 0) {
                prevDay = currentDay;
            }

        }
        System.out.println("The minimum day required " + prevDay);

    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 3;
        int k = 2;
        findMinAndMax(arr, m, k);
    }
}
