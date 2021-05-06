package by.training.fundamental.linear;

import java.util.Scanner;

public class Main2 {
    // Вычислить значение (𝑏+√𝑏^2+4𝑎𝑐)/2𝑎)−𝑎^3𝑐+𝑏^−2
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double valuePart1;
        double valuePart2;
        double valuePart3;
        double value;

        a = enterFromConsole("a >>");
        while (a == 0) {
            System.out.println("Значение числа \"a\" не может быть равно 0. Повторите ввод");
            a = enterFromConsole("a >>");
        }
        b = enterFromConsole("b >>");
        c = enterFromConsole("c >>");

        valuePart1 = Math.pow(b, 2) + (4 * a * c);
        valuePart2 = (b + Math.sqrt(valuePart1)) / (2 * a);
        valuePart3 = Math.pow(a, 3) * c + Math.pow(b, -2);
        value = valuePart2 - valuePart3;

        System.out.println("результат выражения = " + value);
    }

    private static double enterFromConsole(String message) {
        double value;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.print(message);
            sc.nextLine();
        }
        value = sc.nextDouble();
        return value;
    }
}
