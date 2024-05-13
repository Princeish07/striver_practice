package Array.Easy;

/**
 * MaximumConsecutive1s
 */
public class MaximumConsecutive1s {

    static void display(int arr[]) {
        int currentCount = 0;
        int prevCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                if (currentCount >= prevCount) {
                    currentCount = currentCount + 1;
                    prevCount = currentCount;
                } else {
                    currentCount++;
                }
            } else {
                currentCount = 0;
            }
        }

        System.out.println(prevCount);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1 };
        display(arr);

    }

}