public class GCDHCF {

    void display(int first, int second) {
        int HCf = 0;
        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                HCf = i;
            }
        }
        System.out.println(HCf);
    }

    public static void main(String[] args) {
        GCDHCF object = new GCDHCF();
        object.display(4, 8);
    }
}
