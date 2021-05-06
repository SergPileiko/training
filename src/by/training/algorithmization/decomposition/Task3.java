package by.training.algorithmization.decomposition;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a;
        double hexagonArea;

        a = enterFromConsole("Введите положительное число a >> ");
        hexagonArea = hexagonArea(a);
        System.out.print("площадь правильного шестиугольника со стороной " + a + " ≈ ");
        System.out.format("%.2f ", hexagonArea);
    }

    private static double enterFromConsole(String message) {
        double value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            while (!sc.hasNextDouble()) {
                System.out.print(message);
                sc.nextLine();
            }
            value = sc.nextDouble();
            if (value > 0) {
                correct = true;
            } else {
                System.out.print(message);
            }
        }
        return value;
    }

    private static double hexagonArea(double side) {
        if (side <= 0) {
            return -1;
        }
        double hexagonArea;
        double triangleArea;

        triangleArea = triangleArea(side);
        hexagonArea = triangleArea * 6;
        return hexagonArea;
    }

    private static double triangleArea(double side) {
        if (side <= 0) {
            return -1;
        }
        double triangleArea;
        triangleArea = Math.pow(side, 2) * Math.pow(3, 0.5) / 4;
        return triangleArea;
    }
}
