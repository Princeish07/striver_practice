package Array.Easy;

public class MissingNumberInArray {
    public static int missingNumber(int[] a, int N) {

        int hash[] = new int[N + 1]; // hash array

        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        // checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3 };
        int value = missingNumber(arr, 3);
        System.out.println(value);

    }
}
