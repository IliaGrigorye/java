package Lesson2.HW;
import java.nio.channels.NonReadableChannelException;
import java.text.BreakIterator;
import java.util.Scanner;

public class Tringle {
    static int[] Tringle(int n) {
        int[] arr = new int[n];
        int count = 1;
        for (int i = 0; i <= n-1 ; i++) {
            if (i == 0){
                arr[i] = arr[i] + count;
                count++;
            }   
            else{
                arr[i] = arr[i - 1] + count;
                count++;
            }
        }
        return arr;
      }
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите n треугольного числа: ");
        int n = sc.nextInt();
        sc.close();

        var tr = Tringle(n);
        System.out.printf("Для числа %d: ", n);

        for (int i = 0; i <= n-1; i++) {
          System.out.printf("%d, ", tr[i]);
        }
      }
}
