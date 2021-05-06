package by.training.algorithmization.decomposition;

//Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        int[] array;

        n = enterFromConsole("Введите число N: ");
        array = createArrayForN(n);
        printArray(array);
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

    private static int[] createArrayForN(int n) {
        int[] array;
        int index = 0;
        int timeValue = n;
        while (timeValue > 0) {
            timeValue = timeValue / 10;
            index++;
        }
        timeValue = n;
        array = new int[index];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = timeValue % 10;
            timeValue = timeValue / 10;
        }
        return array;
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
