public class Pattern18 {
    void display(int n) {
        char originalCh = 'A';
        originalCh += n - 1;
        for (int i = 0; i <= n; i++) {
            char ch = 'A';

            for (char ch = 'E' - i; ch <= i; ch++) {

                System.out.print(ch);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern18 pattern18 = new Pattern18();
        pattern18.display(5);
    }
}
