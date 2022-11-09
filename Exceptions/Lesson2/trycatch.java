import java.io.FileReader;
import java.io.IOException;

public class trycatch {
    public static void main(String[] args) {

        FileReader test1 = null;
        try {
            test1 = new FileReader("test");
            test1.read();
        }catch (RuntimeException | IOException e){
            System.out.println("перехват ошибки: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if(test1 != null){
                try {
                    test1.close();
                }catch (IOException e){
                    System.out.println("ошибка была закрыта");
                }
            }
            System.out.println("finally finished");
        }
    }
}
