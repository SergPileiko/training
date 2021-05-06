package by.training.algorithmization.decomposition;

// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {
        long sumFactorial;
        int firstValue;
        int lastValue;

        firstValue = 1;
        lastValue = 9;
        sumFactorial = factorialOddSum(firstValue, lastValue);

        System.out.println("Сумма факториалов всех нечетных чисел от " + firstValue + " до " + lastValue + " = " + sumFactorial);
    }

    private static long factorialOddSum(int firstValue, int lastValue) {
        long sum = 0;
        for (int i = firstValue; i <= lastValue; i++) {
            if (i % 2 != 0) {
                sum += factorial(i);
            }
        }
        return sum;
    }

    private static long factorial(int value) {
        if (value < 0) {
            return 0;
        }
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
