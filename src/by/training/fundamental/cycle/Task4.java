package by.training.fundamental.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double result = 1;
        int startValue;
        int i = 1;
        boolean condition = true;

        while (condition) {
            startValue = enterFromConsole("Введите 0, если считаете, что расчёт должен начинаться с нуля, или 1, если считаете, что с единицы: >> ");
            if (startValue == 1) {
                i = 1;
                condition = false;
            }
            if (startValue == 0) {
                i = 0;
                condition = false;
            }
        }

        for (; i <= 200; i++) {
            result = (result * Math.pow(i, 2));
        }

        System.out.println("Произведения квадратов первых двухсот чисел = " + result);
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
