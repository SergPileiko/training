package by.training.algorithmization.one_array;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class Task6 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = new int[n];
        initArray(array);
        printArray(array);

        int sum = sumIndexSimpleNumber(array);

        System.out.println("Вычислить сумму чисел, порядковые номера которых являются простыми числами = " + sum);
    }

    private static int sumIndexSimpleNumber(int[] array) {
        int sum = 0;
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i > 0 && j != 1 && i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    private static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
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
}
