package by.training.fundamental.branching;

/*Вычислить значение функции:
если x<=3 : x^2-3x+9
если x>3 : 1/(x^3+6) */

import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {
        int x;
        double result;

        x = enterFromConsole("x >> ");
        if (x <= 3) {
            result = (Math.pow(x, 2) - (x * 3) + 9);
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("result = " + result);
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
