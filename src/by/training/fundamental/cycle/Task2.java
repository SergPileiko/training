package by.training.fundamental.cycle;


// Вычислить значения функции на отрезке [а,b] c шагом h: y=x, x > 2 ; y=-x, x <= 2

public class Task2 {
    public static void main(String[] args) {
        double a = -5;
        double b = 8;
        double h = 1.5;
        double x;
        double y;

        for (x = a; x <= b; x = x + h) {
            if (x > 2) {
                y = x;
                System.out.println("При х= " + x + " Значение у = " + y);
            }
            if (x <= 2) {
                y = -x;
                System.out.println("При х= " + x + " Значение у = " + y);
            }
        }
    }
}
