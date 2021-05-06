package by.training.algorithmization.one_array;

//Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[]{6, 9, 0, -3, 8, -11.5, -8, 0};
        printArray(array);
        changeMaxAndMin(array);
        printArray(array);

    }

    private static void printArray(double[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        for (; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);

    }

    private static void changeMaxAndMin(double[] array) {
        double max = array[0];
        double min = array[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    }
}
