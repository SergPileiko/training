package by.training.fundamental.branching;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник

public class Main1 {
    public static void main(String[] args) {
        int firstCorner;
        int secondCorner;

        firstCorner = 50;
        secondCorner = 60;

        canTriangle(firstCorner, secondCorner);
    }

    private static void canTriangle(int x, int y) {
        int thirdCorner;
        thirdCorner = 180 - Math.abs(x) - Math.abs(y);
        if (thirdCorner > 0 && (thirdCorner == 90 || x == 90 || y == 90)) {
            System.out.println("Такой треугольник существует. Он прямоугольный!");
        } else if (thirdCorner > 0) {
            System.out.println("Такой треугольник существует. Он не прямоугольный!");
        } else {
            System.out.println("Такой треугольник не существует.");
        }
    }
}
