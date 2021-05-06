package by.training.algorithmization.one_array;

import java.util.Random;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task1 {
    public static void main(String[] args) {
        int n = 9;
        int k = 3;
        int sum = 0;

        int[] array = new int[n];
        initArray(array);
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % k) == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("sum = " + sum);
    }

    private static void printArray(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        for (; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);

    }

    private static void initArray(int[] array) {
        if (array == null) {
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }
}
