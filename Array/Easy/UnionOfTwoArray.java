package Array.Easy;

import java.util.HashSet;

public class UnionOfTwoArray {

    static void display(int arrA[], int arrB[]) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < arrA.length; i++) {
            hashSet.add(arrA[i]);
        }

        for (int i = 0; i < arrB.length; i++) {
            hashSet.add(arrB[i]);
        }

        for (Integer value : hashSet) {
            System.out.print(value);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        display(arr1, arr2);
    }

}
