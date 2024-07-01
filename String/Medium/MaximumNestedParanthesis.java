package String.Medium;

public class MaximumNestedParanthesis {
    public static void display(String s) {
        int countOpen = 0;
        int maxDepth = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countOpen++;
                if (countOpen > maxDepth) {
                    maxDepth = countOpen;
                }

            } else if (s.charAt(i) == ')') {
                countOpen--;
            }

        }
        System.out.println(maxDepth);
    }

    public static void main(String[] args) {
        display("(1+(2*3)+((8)/4))+1");

    }
}
