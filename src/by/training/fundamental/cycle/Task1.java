package by.training.fundamental.cycle;

//программа суммирует все числа от 1 до введенного пользователем числа

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a;
        long result = 0;
        a = enterFromConsole("Введите целое положительное число: ");
        for (int i = 0; i < a; i++) {
            result = result + i;
        }
        System.out.println("Введенное число: " + a);
        System.out.println("Сумма всех чисел до " + a + " составляет " + result);

    }

    private static int enterFromConsole(String message) {
        int value;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print(message);
            sc.nextLine();
        }
        value = sc.nextInt();
        return value;
    }
}
