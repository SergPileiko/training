package by.training.algorithmization.decomposition;

import java.util.Random;
import java.util.Scanner;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

public class Task8 {
    public static void main(String[] args) {
        int d;
        int[] array;
        int k;
        int length;
        int sumThreeMembers;

        d = enterFromConsole("Укажите длинну массива >> ");
        k = enterFromConsole("Укажите начальный элемент массвиа для расчёта >> ");
        length = 3;
        array = new int[d];
        initArray(array);
        printArray(array);
        sumThreeMembers = sumValuesFromArray(array, k, length);
        printMessage(sumThreeMembers);
    }

    private static int sumValuesFromArray(int[] array, int startingValue, int length) {
        if (array == null || array.length == 0 || startingValue + length > array.length - 1) {
            return -1;
        }
        int sum = 0;
        for (int i = startingValue; i < startingValue + length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static void initArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
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

    private static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int i = 0;
        for (; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);
    }

    private static void printMessage(int sum) {
        if (sum == -1) {
            System.out.println("Данные не корректны");
            return;
        }
        System.out.println("суммы трех последовательно расположенных элементов = " + sum);
    }
}
