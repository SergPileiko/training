package by.training.algorithmization.array_of_array;

import java.util.Random;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
//4-6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task1 {
    public static void main(String[] args) {

        int[][] mas = new int[5][5];
        init(mas);
        print(mas);

        // 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        printOddMatrix(mas);

        // 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        diagonalMatrix(mas);

        // 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
        printOnlyLinaAndColumn(mas, 2, 2);

        // 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
        int[][] matrix = createMatrixN(8);
        print(matrix);

        // 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
        int[][] matrix2 = createMatrixN5(8);
        print(matrix2);


        int[][] matrix3 = createMatrixN6(8);
        print(matrix3);
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

    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    private static void printOddMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas[i].length; j += 2) {
                if (mas[0][j] > mas[mas.length - 1][j]) {
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    private static void diagonalMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][mas.length - 1 - i] + " ");
        }
    }

    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
    private static void printOnlyLinaAndColumn(int[][] mas, int k, int p) {
        for (int i = 0; i < mas.length; i++) {
            if (i == k) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
            } else {
                System.out.print("  ");
            }
            for (int j = 0; j < mas[i].length; j++) {
                if (j == p && i != k) {
                    System.out.print(mas[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    private static int[][] createMatrixN(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = matrix[i].length - j;
                }
            }
        }
        return matrix;
    }

    //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    private static int[][] createMatrixN5(int n) {
        int[][] matrix = new int[n][n];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - count; j++) {
                matrix[i][j] = i;
            }
            count++;
        }
        return matrix;
    }

    //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    private static int[][] createMatrixN6(int n) {
        int[][] matrix = new int[n][n];
        int count = 0;
        boolean turn = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = count; j < matrix[i].length - count; j++) {
                matrix[i][j] = 1;
            }
            if (count == n / 2) {
                turn = true;
            }
            if (!turn) {
                count++;
            } else {
                count--;
            }
        }
        return matrix;
    }
}
