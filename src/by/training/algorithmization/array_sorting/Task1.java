package by.training.algorithmization.array_sorting;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[7];
        int k = 0;
        initArray(firstArray);
        initArray(secondArray);
        printArray(firstArray);
        printArray(secondArray);
        int[] newArray = arrayMerge(firstArray, secondArray, k);
        printArray(newArray);
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

    private static int[] arrayMerge(int[] first, int[] second, int k) {
        int[] newArray = new int[(first.length + second.length)];
        int count = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = first[count];
            count++;
            if (i == k) {
                for (int j = 0; j < second.length; j++) {
                    i++;
                    newArray[i] = second[j];
                }
            }
        }
        return newArray;
    }
}
