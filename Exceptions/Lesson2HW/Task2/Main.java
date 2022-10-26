public class Main {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 6 , 7, 7, 88, 1, 4, 9, 11, 12};

            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
