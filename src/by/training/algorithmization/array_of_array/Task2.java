package by.training.algorithmization.array_of_array;

import java.text.DecimalFormat;
import java.util.Random;

//7. Сформировать квадратную матрицу порядка N по правилу: A[i,j]=sin((i^2-j^2)/n);

public class Task2 {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        init(mas);
        print(mas);
        double[][] matrix = createMatrixSin(8);
        print(matrix);
        System.out.println("Количество положительных элементов в матрице: " + positiveValue(matrix));
    }

    private static void init(int[][] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }
    }

    private static void print(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d] ", mas[i][j]);
            }
            System.out.println("");
        }
    }

    private static void print(double[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.format("[%6.3f] ", mas[i][j]);
            }
            System.out.println("");
        }
    }

    //Сформировать квадратную матрицу порядка N по правилу: A[i,j]=sin((i^2-j^2)/n);
    private static double[][] createMatrixSin(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }
        return matrix;
    }

    //и подсчитать количество положительных элементов в ней.
    private static int positiveValue(double[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
