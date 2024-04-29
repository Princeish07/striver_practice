public class Pattern17 {
    void display(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int breakPoint = (2 * i + 1) / 2;
            char data = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(data);
                if (j <= breakPoint) {

                    data++;
                } else {
                    data--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern17 pattern17 = new Pattern17();
        pattern17.display(5);
    }
}
