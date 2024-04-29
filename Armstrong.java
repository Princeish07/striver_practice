public class Armstrong {
    void display(int n) {
        int count = 0;
        int original = n;
        int temp = n;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int powerOfSumOfAll = 0;

        while (original > 0) {
            int digit = original % 10;
            original = original / 10;
            powerOfSumOfAll += Math.pow(digit, count);

        }

        System.out.println(powerOfSumOfAll == n);
    }

    public static void main(String[] args) {
        Armstrong object = new Armstrong();
        object.display(153);
    }
}
