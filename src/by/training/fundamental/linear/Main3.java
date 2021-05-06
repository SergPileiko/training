package by.training.fundamental.linear;

import java.util.Scanner;

public class Main3 {
    // ((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))*𝑡𝑔 𝑥𝑦

    public static void main(String[] args) {
        double x;
        double y;
        double value;

        x = enterFromConsole("x >> ");
        y = enterFromConsole("y >> ");

        value = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.print("Значение выражения: " + value);

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
