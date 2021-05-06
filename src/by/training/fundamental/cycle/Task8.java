package by.training.fundamental.cycle;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {
    public static void main(String[] args) {
        int a = 56789;
        int b = 123456;

        includeNumber(a);
        includeNumber(b);
    }

    private static void includeNumber(int n) {
        int x = 0;
        int y = n;
        print("Число " + n + " состоит из цифр: ");
        while (y / 10 > 0) {
            x++;
            y = y / 10;
        }
        for (int i = 0; i <= x; i++) {
            print(n % 10);
            n = n / 10;
        }
    }

    private static void print(String message) {
        System.out.println("");
        System.out.print(message);
    }

    private static void print(int message) {
        System.out.print(message + " ");
    }
}
