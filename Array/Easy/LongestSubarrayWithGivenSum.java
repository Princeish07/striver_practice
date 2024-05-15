package Array.Easy;

import java.util.ArrayList;

public class LongestSubarrayWithGivenSum {
    static void display(int arr[], int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            long max = 0;

            for (int j = i; j < arr.length; j++) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();

                // for (int p = i; p <= j; p++) { //if want to run this with brute force three
                // loops uncomment this
                max += arr[j];
                arrayList.add(arr[j]);

                // }
                if (max == k) {
                    for (int l = 0; l < arrayList.size(); l++) {
                        System.out.print(arrayList.get(l));
                    }
                    System.out.println();
                    maxLen = Math.max(maxLen, j - i + 1);
                    System.out.println("Length " + maxLen);
                    System.out.println("Length " + (j - i + 1));

                }
            }
        }
        System.out.print("Maximum length of subarray sum " + k + " is " + maxLen);

    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 3, 2, 2, 2 };
        display(arr, 6);

    }
}
