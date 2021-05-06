package by.training.fundamental.linear;

import java.util.Scanner;

public class Main4 {
    // действительное число R вида nnn.ddd
    public static void main(String[] args) {
        double r;
        double value;

        System.out.println("Введите значение вида nnn.ddd:");
        r = enterFromConsole();

        value = changeValue(r);
        System.out.format("%3.3f%n", value);


    }

    private static double enterFromConsole() {
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print(">> ");
        }
        a = scanner.nextDouble();
        return a;
    }

    static double changeValue(double x) {
        double result;
        double temp;
        int i;

        i = (int) x;
        temp = x - i;
        result = temp * 1000 + i * 0.001;

        return result;
    }
}
