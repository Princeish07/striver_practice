package Array.Easy;

public class FindNumberOnesAndTwice {
    static int display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }
        return -1;

    }

    static int displayUsingXor(int arr[]) {
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2 };
        int value = displayUsingXor(arr);
        System.out.println(value);
    }
}
