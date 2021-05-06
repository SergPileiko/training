package by.training.algorithmization.one_array;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число (наименьшее из них).
public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 0, 3, 2, 11, 2, 0, 3, 2, 17, 3, 5};
        printArray(array);
        System.out.println("наиболее часто встречающееся число: " + oftenValue(array));
    }

    private static int oftenValue(int[] array) {
        int valueOften = array[0];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            int countSecond = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    countSecond++;
                }
                if (countSecond > count) {
                    count = countSecond;
                    valueOften = array[i];
                } else if (countSecond == count && valueOften > array[i]) {
                    count = countSecond;
                    valueOften = array[i];
                }
            }
        }
        return valueOften;
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
