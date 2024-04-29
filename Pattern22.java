public class Pattern22 {

    void display(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                int value = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(value);

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern22 pattern22 = new Pattern22();
        pattern22.display(5);

    }
}
