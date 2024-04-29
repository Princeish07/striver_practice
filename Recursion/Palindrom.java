package Recursion;

public class Palindrom {
    Boolean display(int i, String data) {
        if (i >= data.length() / 2)
            return true;
        if (data.charAt(i) != data.charAt(data.length() - i - 1))
            return false;

        return display(i++, data);

    }

    public static void main(String[] args) {

        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.display(0, "ABAABA"));
    }
}
