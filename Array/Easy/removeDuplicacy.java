package Array.Easy;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicacy {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = { 1, 2, 4, 1, 5, 3 };
        display(arr);
    }

    public static void display(int arr[]) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }
        for (int one : set) {
            System.out.print(one);
        }
    }
}
