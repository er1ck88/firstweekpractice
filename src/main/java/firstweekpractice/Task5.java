package firstweekpractice;

import java.util.Scanner;

/*

        Напишите аналог функции swap, которая меняет значения двух параметров местами (без вспомогательной переменной)
        Входные данные
        a = 8; b = 10
     */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//2
        int b = scanner.nextInt();//5

        System.out.println("Входные данные");
        System.out.println("a=" + a + ";b=" + b);

        //логика
        a = a + b;//2 + 5 = 7 -> a = 7
        b = a - b;//7 - 5 = 2 -> b = 2
        a = a - b;//7 - 2 = 5 -> a = 5

        System.out.println("Результат");
        System.out.println("a=" + a + ";b=" + b);
    }
}
