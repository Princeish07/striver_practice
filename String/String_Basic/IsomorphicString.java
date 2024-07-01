package String.String_Basic;

import java.util.HashMap;

/**
 * IsomorphicString
 */
public class IsomorphicString {

    public static void display(String a1, String a2) {
        if (a1.length() != a2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }
        boolean isIsomorphic = true;
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();

        for (int i = 0; i < a1.length(); i++) {
            if (hashMap.containsKey(a1.charAt(i))) {
                if (hashMap.get(a1.charAt(i)) != a2.charAt(i)) {

                    isIsomorphic = false;
                    break;
                }

            } else {
                hashMap.put(a1.charAt(i), a2.charAt(i));
            }

        }

        if (isIsomorphic == true) {
            System.out.print("String is isomorphic");
        } else {
            System.out.print("Not isomorphic");

        }

    }

    public static void main(String ags[]) {

        display("egg", "add");

    }
}