import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 5;
            System.out.println(a / b);
            printSum(66, 234);
            int[] abc = {1, 2, 3, 4};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
