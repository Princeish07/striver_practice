package Hashing;

import java.util.HashMap;

public class NumberFrequencyWithHashmap {

    static void display(int arr[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);

            } else {
                hashMap.put(arr[i], 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 2, 3, };
        display(arr);

    }

}
