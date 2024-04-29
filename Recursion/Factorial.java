package Recursion;

public class Factorial {
    int display(int n) {

        if (n == 0)
            return 1;
        return n * display(n - 1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.print(obj.display(5));
    }
}
