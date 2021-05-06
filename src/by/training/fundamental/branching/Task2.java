package by.training.fundamental.branching;

// Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        int min1;
        int min2;
        int max;

        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");
        c = enterFromConsole("c >> ");
        d = enterFromConsole("d >> ");

        min1 = min(a, b);
        min2 = min(c, d);
        max = max(min1, min2);

        System.out.println("max = " + max);
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

    private static int max(int x, int y) {
        int max;
        if (x >= y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    private static int min(int x, int y) {
        int min;
        if (x <= y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }
}

