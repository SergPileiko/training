package by.training.algorithmization.decomposition;

import java.util.Scanner;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Task6 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        boolean coprime;

        a = enterFromConsole("Введите натуральное число a >> ");
        b = enterFromConsole("Введите натуральное число b >> ");
        c = enterFromConsole("Введите натуральное число c >> ");
        coprime = coprimeNumber(a, b, c);

        if (coprime) {
            printMessage("Числа " + a + " " + b + " " + c + " взанимно простые");
        } else {
            printMessage("Числа " + a + " " + b + " " + c + " не взанимно простые");
        }
    }

    private static int greatestCommonFactorEuclid(int a, int b) {  //наибольший общий делитель
        if (a == 0 || b == 0) {
            if (Math.abs(a) >= Math.abs(b)) {
                return a;
            } else {
                return b;
            }
        }
        int gcf = 0;
        int min = Math.abs(a);
        int max = Math.abs(b);

        if (min > max) {
            min = Math.abs(b);
            max = Math.abs(a);
        }
        boolean next = false;
        int remainder;
        while (!next) {
            remainder = max % min;
            if (remainder == 0) {
                gcf = min;
                next = true;
            } else {
                max = min;
                min = remainder;
            }
        }
        return gcf;
    }

    private static int enterFromConsole(String message) {
        int value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            while (!sc.hasNextInt()) {
                System.out.print(message);
                sc.nextLine();
            }
            value = sc.nextInt();
            if (value > 0) {
                correct = true;
            } else {
                System.out.print(message);
            }
        }
        return value;
    }

    private static boolean coprimeNumber(int a, int b, int c) {
        boolean isCoprime = false;
        int gcf1;
        int gcf2;
        int gcf3;

        gcf1 = greatestCommonFactorEuclid(a, b);
        gcf2 = greatestCommonFactorEuclid(a, c);
        gcf3 = greatestCommonFactorEuclid(c, b);

        if (gcf1 == 1 && gcf2 == 1 && gcf3 == 1) {
            isCoprime = true;
        }
        return isCoprime;
    }

    private static void printMessage(String message) {
        System.out.print(message);
    }
}