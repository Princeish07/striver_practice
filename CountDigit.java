public class CountDigit {
    void displayLength(int n) {
        int i = n;
        int countValue = 0;
        while (i > 0) {
            i = i / 10;
            countValue++;
        }
        System.out.print(countValue);
    }

    public static void main(String[] args) {

        CountDigit countDigit = new CountDigit();
        countDigit.displayLength(99439056);
    }

}
