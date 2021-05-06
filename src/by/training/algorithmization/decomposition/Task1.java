package by.training.algorithmization.decomposition;

import java.util.Scanner;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел (НОК(А,В)=А*В/НОД(А,В))
// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int leastCommonMultiple;
        int greatestCommonFactor;
        int greatestCommonFactorForFour;

        a = enterFromConsole("Введите натуральное число a >> ");
        b = enterFromConsole("Введите натуральное число b >> ");
        c = enterFromConsole("Введите натуральное число c >> ");
        d = enterFromConsole("Введите натуральное число d >> ");

        greatestCommonFactor = greatestCommonFactorMy(a, b);
        leastCommonMultiple = leastCommonMultiple(a, b);
        greatestCommonFactorForFour = greatestCommonFactorForFour(a, b, c, d);

        System.out.println("НОД(" + a + ", " + b + ") = " + greatestCommonFactor);
        System.out.println("НОК(" + a + ", " + b + ") = " + leastCommonMultiple);
        System.out.println(greatestCommonFactorEuclid(a, b));
        System.out.println("НОК(" + a + ", " + b + ", " + c + ", " + d + ") = " + greatestCommonFactorForFour);

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

    private static int greatestCommonFactorMy(int a, int b) {  //наибольший общий делитель
        if (a == 0) {
            return Math.abs(b);
        } else if (b == 0) {
            return Math.abs(a);
        }
        int greatestCommonFactor = 1;
        int min = Math.abs(a);
        int max = Math.abs(b);

        if (Math.abs(a) > Math.abs(b)) {
            min = Math.abs(b);
            max = Math.abs(a);
        }
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                greatestCommonFactor = i;
            }
        }
        return greatestCommonFactor;
    }

    private static int leastCommonMultiple(int a, int b) {
        int leastCommonMultiple = 1;
        if (a == 0 || b == 0) {
            if (Math.abs(a) >= Math.abs(b)) {
                return a;
            } else {
                return b;
            }
        }
        leastCommonMultiple = (a * b) / greatestCommonFactorMy(a, b);
        return leastCommonMultiple;
    }

    private static int greatestCommonFactorEuclid(int a, int b) {  //наибольший общий делитель
        if (a == 0 || b == 0) {
            if (Math.abs(a) >= Math.abs(b)) {
                return a;
            } else {
                return b;
            }
        }
        int gcf = 0;
        int min = Math.abs(a);
        int max = Math.abs(b);

        if (min > max) {
            min = Math.abs(b);
            max = Math.abs(a);
        }
        boolean next = false;
        int remainder;
        while (!next) {
            remainder = max % min;
            if (remainder == 0) {
                gcf = min;
                next = true;
            } else {
                max = min;
                min = remainder;
            }
        }
        return gcf;
    }

    private static int greatestCommonFactorForFour(int a, int b, int c, int d) {
        int gcf2;
        int gcf3;
        int gcf4;

        gcf2 = greatestCommonFactorEuclid(a, b);
        gcf3 = greatestCommonFactorEuclid(gcf2, c);
        gcf4 = greatestCommonFactorEuclid(gcf3, d);

        return gcf4;
    }
}
