public class Prime {
    boolean display(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        System.out.print(obj.display(97));

    }
}
