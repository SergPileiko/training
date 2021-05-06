package by.training.algorithmization.decomposition;

import java.util.Scanner;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой.
public class Task9 {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int t;
        boolean isConvex;
        double area;

        x = enterFromConsole("Введите сторону четырехугольника X: ");
        y = enterFromConsole("Введите сторону четырехугольника Y: ");
        z = enterFromConsole("Введите сторону четырехугольника Z: ");
        t = enterFromConsole("Введите сторону четырехугольника T: ");
        isConvex = isConvex();
        area = quadArea(x, y, z, t, isConvex);
        System.out.println("Площадь прямоугольника " + area);

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

    private static double quadArea(int x, int y, int z, int t, boolean bool) {
        if (x <= 0 || y <= 0 || z <= 0 || t <= 0) {
            return -1;
        }
        double area = -1;
        if (bool) {
            area = rightTriangleArea(x, y) + triangleArea(z, t, hypotenuse(x, y));
        } else if (x + y > z + t) {
            area = rightTriangleArea(x, y) - triangleArea(z, t, hypotenuse(x, y));
        }
        return area;
    }

    private static double rightTriangleArea(double x, double y) {
        if (x <= 0 || y <= 0) {
            return -1;
        }
        double areaTriangle = 0.5 * x * y;
        return areaTriangle;
    }

    private static double triangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return -1;
        }
        double area = 0;
        double halfPerimeter = (a + b + c) / 2;
        double time = halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c);
        area = Math.sqrt(time);
        return area;
    }

    private static double hypotenuse(double a, double b) {
        double hypotenuse;
        hypotenuse = Math.sqrt(((Math.pow(a, 2) + Math.pow(b, 2))));
        return hypotenuse;
    }

    private static boolean isConvex() {
        int forBool = 0;
        do {
            forBool = enterFromConsole("Введите число 1 для указания, что четырёхугольник выпуклый или 2 для вогнутого: ");
        } while (forBool > 3 || forBool < 0);
        if (forBool == 1) {
            return true;
        } else {
            return false;
        }
    }

}
