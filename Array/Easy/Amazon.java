package Array.Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Amazon {
    public static void display(List<Integer> prices, int k, int threshold) {
        prices.sort(Comparator.reverseOrder());
        int removed = 0;
        for (int i = 0; i < prices.size(); i++) {
            int sum = 0;

            for (int j = i; j < k; j++) {
                sum = sum + prices.get(i);
            }
            if (sum > threshold) {
                removed++;
            }

        }
        System.out.println(removed);
    }

    public static void main(String[] args) {
        List<Integer> price = new ArrayList<Integer>();
        price.add(1);
        price.add(1);
        price.add(1);
        price.add(1);
        price.add(6);
        price.add(5);

        display(price, 3, 6);
    }
}
