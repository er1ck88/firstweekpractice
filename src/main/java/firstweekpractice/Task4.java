package firstweekpractice;

import java.util.Scanner;

/*

Дана площадь круга, нужно найти диаметр окружности и длину окружности.
S  = PI * (D^2 / 4) - это через диаметр => d = sqrt(S * 4 / PI)
S = PI * r^2 - радиус
S = L^2 / (4 *PI) - площадь через длину
Отношение длины окружности к диаметру является постоянным числом.
π = L : d

Входные данные:
91
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square = scanner.nextInt();
        //диаметр
        double d = Math.sqrt(square * 4 / Math.PI);
        //длина
        double l = Math.PI * d;

        System.out.println("Результат: d=" + d + ";l=" + l);
    }
}
