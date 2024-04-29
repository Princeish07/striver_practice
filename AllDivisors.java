public class AllDivisors {
    void display(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        AllDivisors object = new AllDivisors();
        object.display(97);

    }
}
