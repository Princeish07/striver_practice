package Recursion;

public class SumFirstN {
    void display(int n, int sum) {
        if (n < 1) {
            System.out.print(sum);
            return;
        }

        display(n - 1, sum + n);

    }

    int displayFunctional(int n) {
        if (n < 1)
            return 0;

        return n + displayFunctional(n - 1);
    }

    public static void main(String[] args) {
        SumFirstN obj = new SumFirstN();
        System.out.print(obj.displayFunctional(6));
        ;
    }
}
