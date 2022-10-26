import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите что нибудь: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string = string.trim();
        if (string.isEmpty()){
            throw new IllegalArgumentException("Строка пустая");
        }
        else {
            System.out.println(string);
        }
    }
}
