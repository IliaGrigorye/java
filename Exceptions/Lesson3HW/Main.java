import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите свои данные через пробел ");
        System.out.println("Пример: Иванов Петр Игоревич 15.09.1998 89834457790 муж");
        Scanner sc = new Scanner(System.in);

        String[] date = new String[6];
        int i;
        try(FileWriter writer = new FileWriter("File.txt")) {
            for (i = 0; i < date.length; i++) {
                date[i] = sc.next();
            }

            Long.parseLong(date[4]);

            writer.append("\n");
            System.out.println("вы ввели: ");
            for (i = 0; i < date.length; i++) {
                System.out.print(date[i] + " ");
                writer.append(date[i] + " ");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ввели слишком много данных");
        }catch (NumberFormatException e){
            System.out.println("Ошибка при вводе номера телефона");
            System.out.println(date[4]);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("перехват ошибки: " + e.getClass().getSimpleName());
            throw new RuntimeException(e);
        }

    }
}
