import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws SavedException {
        try(FileReader reader = new FileReader("C:/Programming/programming/Working in Visual Studio Code/Java/Exceptions/Lesson3/File.txt");
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()){
                writer.write(reader.read());
            }
        }catch (RuntimeException | IOException e){
            System.out.println("перехват ошибки: " + e.getClass().getSimpleName());
            throw  new SavedException("save", e);
        }

        System.out.println("копирование выполнено");
    }
}
