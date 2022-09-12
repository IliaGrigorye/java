package Lesson3.HW;

import java.util.Scanner;

public class HonTower {
    static void honoiTower(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Переместить диск 1 со стержня " + from_rod + " на стержень " + to_rod);
            return;
        }
        honoiTower(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Переместить диск " + n + " со стержня " + from_rod + " на стержень " + to_rod);
        honoiTower(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        System.out.println("Игра Ханойская башня");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите количество дисков: ");
        int n = sc.nextInt();
        sc.close();
        honoiTower(n, 'A', 'C', 'B'); // A,C,B названия стержней
        System.out.println("Конец!");

    }

}
