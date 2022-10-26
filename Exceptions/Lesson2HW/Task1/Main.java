import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");

        while (true) {
            try {
                float num = in.nextFloat();
                System.out.printf("Ваше число: %.2f \n", num);

                break;
            } catch (InputMismatchException ex) {
                System.err.println("Неверный ввод, пожалуйста, введите еще раз");
                in.nextLine();
            }
        }
    }
}
