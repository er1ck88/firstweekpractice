package firstweekpractice;

import java.util.Scanner;

public class Task6 {
    /*
    Дано двузначное число. Вывести сначала левую цифру (единицы), затем правую (десятки)
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        System.out.println("Результат");
        System.out.println("Единицы: " + c % 10 + ";Десятки: " + c / 10);
    }
}
