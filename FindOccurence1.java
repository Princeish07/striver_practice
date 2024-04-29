class FindOccurence1 {
    int counter = 0;

    void displayOccurance(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                counter++;
                System.out.print(counter);
            }
            System.out.println();
        }

    }

    void printCharacter(int n) {
        for (int i = 0; i < n; i++) {
            char c = 'A';

            for (int j = 0; j <= i; j++) {

                System.out.print(c++);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        FindOccurence1 findOccurence = new FindOccurence1();
        findOccurence.printCharacter(5);
    }

}
