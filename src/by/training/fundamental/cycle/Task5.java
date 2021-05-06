package by.training.fundamental.cycle;

//Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//Общий член ряда имеет вид An = 1/2^n + 1/3^n.

public class Task5 {
    public static void main(String[] args) {
        double e = 1;
        double value;
        double result = 0;
        double n = 10;
        boolean bool = true;
        int counter = 0;

        while (bool) {
            n--;
            value = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(value) >= e) {
                result = result + value;
                counter++;
                if (counter >= 3) {
                    bool = false;
                }
            }
        }

        System.out.println("Сумма трех членов ряда равна = " + result);

    }
}
