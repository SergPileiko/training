package by.training.fundamental.linear;

import java.util.Scanner;


public class Main {
    // Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");
        c = enterFromConsole("c >> ");
        z = ((a - 3) * b / 2.0) + c;

        System.out.println("z = " + z);
    }

    private static double enterFromConsole(String message) {
        double value;
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print(message);
        }
        value = scanner.nextDouble();
        return value;
    }

}
