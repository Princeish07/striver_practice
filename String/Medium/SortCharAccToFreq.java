package String.Medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortCharAccToFreq {
    public static void display(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);

            }
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                    Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        for (Map.Entry<Character, Integer> map : list) {
            System.out.println(map.getKey() + " : " + map.getValue());

        }
    }

    public static void main(String[] args) {
        display("Heelllo");

    }
}
