package by.training.algorithmization.one_array;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        printArray(array);
        changeArray(array);
        printArray(array);

    }

    private static void changeArray(int[] array) {
        int count = array.length / 2;
        for (int i = 2; i < array.length; i++) {
            if (count > 0) {
                for (int j = i; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                count--;
                array[array.length - 1] = 0;
            }
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
