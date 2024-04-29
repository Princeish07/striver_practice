public class Pattern21 {

    void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }

            // if (i == 0 || i == n - 1) {
            // for (int j = 0; j < n; j++) {
            // System.out.print("*");

            // }
            // } else {
            // System.out.print("*");
            // for (int j = 0; j < n - 2; j++) {
            // System.out.print("0");

            // }
            // System.out.print("*");

            // }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern21 pattern21 = new Pattern21();
        pattern21.display(5);

    }
}
