package by.training.algorithmization.decomposition;

// Составить программу, которая в массиве A[N] находит второе по величине число
//(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n;
        int[] array;
        int secondMax;

        n = enterFromConsole("Введите длинну массива N: ");
        array = new int[n];
        initArray(array);
        printArray(array);
        secondMax = secondMax(array);
        System.out.println("второе по величине число: " + secondMax);
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

    private static int secondMax(int[] array) {
        int max = array[0];
        int secondMax = 0;
        int indexMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        secondMax = array[0];
        int j = 1;
        if (indexMax == 0) {
            while (max == array[j] && j < array.length - 1) {
                j++;
                secondMax = array[j];
            }
        }
        for (; j < array.length; j++) {
            if (indexMax != j) {
                if (array[j] > secondMax) {
                    secondMax = array[j];
                }
            }
        }
        return secondMax;
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
}
