package by.training.algorithmization.array_sorting;

//2. Даны две последовательности a1<=a2<=a3..<=aN и b1<=b2<=b3..<=bM. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Task2 {
    public static void main(String[] args) {
        int[] arrayFirst;
        int[] arraySecond;
        int[] arrayNew;

        arrayFirst = new int[]{2, 4, 5, 7, 8, 11, 15, 20};
        arraySecond = new int[]{5, 7, 12, 13, 14, 16, 18, 25, 27};

        printArray(arrayFirst);
        printArray(arraySecond);

        arrayNew = arrayMerge(arrayFirst, arraySecond);
        printArray(arrayNew);
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

    private static int[] arrayMerge(int[] first, int[] second) {
        int[] newArray = new int[(first.length + second.length)];
        int countFirst = 0;
        int countSecond = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (countFirst <= first.length - 1 && first[countFirst] <= second[countSecond]) {
                newArray[i] = first[countFirst];
                countFirst++;
            } else if (countSecond <= second.length - 1) {
                newArray[i] = second[countSecond];
                countSecond++;
            }
        }

        return newArray;
    }

}
