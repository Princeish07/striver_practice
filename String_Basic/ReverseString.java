package String_Basic;

import java.util.Stack;

public class ReverseString {
    public static void display(String value) {
        String revString = "";
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < value.length(); i++) {

            if (value.charAt(i) == ' ') {
                stack.push(revString);
                revString = "";
            } else {
                revString += value.charAt(i);

            }
        }
        String ans = "";

        while (stack.size() != 1) {
            ans += stack.peek() + "^";

            stack.pop();

        }
        ans += stack.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);

    }

    public static void main(String[] args) {
        display("this is an amazing program ");

    }
}
