package by.training.algorithmization.decomposition;

import java.util.Scanner;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
    public static void main(String[] args) {
        double first;
        double second;

        first = enterFromConsole("Введите первое число: >> ");
        second = enterFromConsole("Введите второе число: >> ");

        isLonger(first, second);
    }

    private static double enterFromConsole(String message) {
        double value = 0.0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.print(message);
            sc.nextLine();
        }
        value = sc.nextDouble();

        return value;
    }

    private static void isLonger(double first, double second) {
        int one = amountNumber(first);
        int two = amountNumber(second);
        String message;
        if (one > two) {
            message = ("Число " + first + " содержит больше цифер чем " + second);
        } else if (one < two) {
            message = ("Число " + second + " содержит больше цифер чем " + first);
        } else {
            message = ("Число " + second + " содержит столько же цифер как и " + first);
        }
        printMessage(message);
    }

    private static int amountNumber(double value) {
        int amount;
        String str = String.valueOf(value);
        str = str.replace(".", "");
        str = str.replace("-", "");

        if (value % 1 == 0) {
            amount = str.length() - 1;
        } else {
            amount = str.length();
        }
        return amount;
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
