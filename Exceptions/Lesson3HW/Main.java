import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите свои данные через пробел ");
        System.out.println("Пример: Иванов Петр Игоревич 15.09.1998 89834457790 f или m");
        System.out.print("Ввод: ");
        Scanner sc = new Scanner(System.in);
        String[] date = new String[6];

        try{
            for (int i = 0; i < date.length; i++) {
                date[i] = sc.next();
            }

            String leng1 = date[3];
            String leng2 = date[5];
            if(leng1.length() != 10 ){
                throw new RuntimeException("Ошибка! Не верный формат даты, введите как указано в примере");
            }
            if(leng2.length() != 1 ){
                throw new RuntimeException("Ошибка! Не верно введен пол, введите как указано в примере");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(date[0]+".txt", true));

            Long.parseLong(date[4]);

            writer.append("\n");
            System.out.print("Введеные данные: |");
            for (int i = 0; i < date.length; i++) {
                System.out.print(date[i] + " ");
                writer.append(date[i] + " ");
            }
            System.out.print(" |Добавлены в " + date[0] + ".txt");

            writer.close();


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ввели слишком много данных");
        }catch (NumberFormatException e){
            System.out.println("Ошибка при вводе номера телефона");
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("перехват ошибки: " + e.getClass().getSimpleName());
        }
    }
}
