package by.training.algorithmization.array_sorting;

import java.util.Random;

//Сортировка выбором. Дана последовательность чисел ... Требуется переставить элементы так,
//чтобы они были расположены по убыванию.

public class Task3 {
    public static void main(String[] args) {
        int index;
        int[] array;

        index = 8;
        array = new int[index];

        initArray(array);
        printArray(array);
        selectingSorting(array);
        printArray(array);
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

    private static void initArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }

    private static void selectingSorting(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int max = array[i];
            int indexMax = i;
            int time = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    indexMax = j;
                }
            }
            if (indexMax != i) {
                time = array[i];
                array[i] = array[indexMax];
                array[indexMax] = time;
            }
        }
    }
}
