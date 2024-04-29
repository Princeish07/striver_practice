package Recursion;

public class Fibonacci {

    int display(int i, int n) {
        if (i >= n) {
            return i;
        }
        System.out.println(i);
        return display(n, i + n); // Swap i and n to generate Fibonacci sequence
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.print(fibonacci.display(0, 5));

    }
}
