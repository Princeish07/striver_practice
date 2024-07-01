package String.String_Basic;

public class RemoveOuterParanthesis {

    public static void display(String stringValue) {
        int count = 0;
        String finalValue = "";
        for (int i = 0; i < stringValue.length(); i++) {
            if (stringValue.charAt(i) == '(' && count++ > 0) {
                finalValue += "(";
            }
            if (stringValue.charAt(i) == ')' && count-- > 1) {
                finalValue += ")";

            }
        }
        System.out.println(finalValue);

    }

    public static void main(String[] args) {
        display("((()())(())(()(())))");
    }
}
