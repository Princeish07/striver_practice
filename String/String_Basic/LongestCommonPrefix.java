package String.String_Basic;

import java.util.Arrays;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {
    public static void display(String[] arr) {
        Arrays.sort(arr);
        String common = "";
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) == arr[1].charAt(i)) {
                common += arr[0].charAt(i);
            } else {
                break;
            }
        }
        System.out.println(common);

    }

    public static void main(String[] args) {

        String arr[] = { "flower", "flow", "flight" };
        String arr2[] = { "Cluster", "Clutch", "Club", "Clue", "Clumsy" };

        display(arr2);

    }

}