package Recursion;

public class PrintN {
    void display(int i, int n) {
        if (i > n)
            return;
        System.out.print("Hello");
        display(i + 1, n);
    }

    void display1ToN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        display1ToN(i + 1, n);
    }

    void displayNto1(int n) {
        if (n <= 0)
            return;
        System.out.println(n);
        displayNto1(n - 1);
    }

    public static void main(String[] args) {
        PrintN obj = new PrintN();
        obj.displayNto1(5);

    }
}
