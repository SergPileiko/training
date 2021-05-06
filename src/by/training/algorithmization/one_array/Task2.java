package by.training.algorithmization.one_array;


// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int z = 11;
        int n = 6;

        int[] mas = new int[n];
        initArray(mas);
        printArray(mas);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                count++;
            }
        }
        printArray(mas);
        System.out.println("количество замен " + count);
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
