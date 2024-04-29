public class Pattern19 {

    void display(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("0");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("0");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern19 pattern19 = new Pattern19();
        pattern19.display(5);

    }

}

// ********** [5,0,5]
// **** **** [4,2,4]
// *** *** [3,4,3]
// ** ** [2,6,2]
// * * [1,8,1]
// * * [1,8,1]
// ** ** [2,6,2]
// *** *** [3,4,4]
// **** **** [4,2,4]
// ********** [5,0,5]