package by.training.algorithmization.one_array;

// Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 0, -3, 8, -11, -8, 0};
        printArrayMore(array);

    }

    private static void printArrayMore(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
