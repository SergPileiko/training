package by.training.algorithmization.one_array;

//Дана последовательность целых чисел n a1,a2,...,an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min()

public class Task8 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{6, 9, 0, -3, -3, 11, -2, 0, -3, -3, 17, -3, 5};
        int[] secondArray = createNewArray(firstArray);
        printArray(firstArray);
        printArray(secondArray);
    }

    private static int[] createNewArray(int[] array) {

        int min = array[0];
        int countMin = 1;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == min) {
                countMin++;
            }
            if (array[i] < min) {
                min = array[i];
                countMin = 1;
            }
        }
        int size = array.length - countMin;
        int[] secondArray = new int[size];
        int index = 0;
        for (int i = 0; i < secondArray.length; i++) {
            while (array[index] == min) {
                index++;
            }
            secondArray[i] = array[index];
            index++;
        }
        return secondArray;
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
