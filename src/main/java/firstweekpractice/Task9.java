package firstweekpractice;


import java.util.Scanner;

/*
     Даны целые числа a, b и с, определяющие квадратное уравнение. Вычислить дискриминант.
          Подсказка: D = b^2 - 4 * a * c
     Входные данные
     a = 6 b = -28 с = 79
     */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (int) Math.pow(b, 2) - 4 * a * c;

        System.out.println("Дискриминант " + d);
    }
}
