package Hashing;

import java.util.HashMap;

public class HighestAndLowestFrequencyElement {
    static void display(int arr[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }

        }
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            // System.out.print(entry.getKey() + " : " + (entry.getValue()));
            // System.out.println();
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;

            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }

        }

        System.out.print("MaX Element" + maxEle + ":" + maxFreq);
        System.out.print("Min Element" + minEle + ":" + minFreq);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };

        display(arr);

    }

}
