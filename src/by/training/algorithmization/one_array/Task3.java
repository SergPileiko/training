package by.training.algorithmization.one_array;
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args) {
        int n = 8;
        double[] array = new double[]{6, 8, 0, -3, 8, -11.5, -8, 0};
        System.out.println("В массиве " + countNegative(array) + " отрицательных элементов");
        System.out.println("В массиве " + countPositive(array) + " положительных элементов");
        System.out.println("В массиве " + countZero(array) + " нулевых элементов");
    }

    public static int countPositive(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZero(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
