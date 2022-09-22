package firstweekpractice;

import java.util.Scanner;

/*

    Напишите программу, которая получает два числа с плавающей точкой х и у в аргументах
    командной строки и выводит евклидово расстояние от точки (х, у) до точки (0, 0)

    Входные данные
    i = 7 j = 5

    Евклидово расстояние - это расстояние между двумя точками,
    вычисляемое по теореме Пифагора.
     (сумма квадратов длин катетов равна квадрату длины гипотенузы.)
     корень квадратный из суммы квадратов x2-x1 и y2-y1
    d = sqrt((x2-x1)^2 + (y2-y1)^2)

    y
    |
  4 |_____(3,4)
    |    /|
    |   / |
    |  /  |
    | /   |
    |/____|________________x
          3
     */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double res = Math.sqrt(Math.pow(x, 2) + y * y);

        System.out.println("Результат работы программы: " + res);
    }
}
