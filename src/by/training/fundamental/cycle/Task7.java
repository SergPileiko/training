package by.training.fundamental.cycle;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task7 {

    public static void main(String[] args) {
        int m;
        int n;

        m = enterFromConsole("Введите начало промежутка m: >> ");
        n = enterFromConsole("Введите начало промежутка n: >> ");

        for (int i = m; i <= n; i++) {
            System.out.print("Дедители для числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + "; ");
                }
            }
            System.out.println("");
        }
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
