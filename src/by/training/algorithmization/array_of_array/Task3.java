package by.training.algorithmization.array_of_array;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int numberColumnFirst;
        int numberColumnSecond;

        int[][] mas = new int[5][5];
        init(mas);
        print(mas);

        do {
            numberColumnFirst = enterFromConsole("Первый столбец для изменения >> ");
            System.out.println("Введите число от 0 до " + (mas[0].length - 1));
        }
        while (numberColumnFirst > mas[0].length - 1);

        do {
            numberColumnSecond = enterFromConsole("Второй столбец для изменения >> ");
            System.out.println("Введите число от 0 до " + (mas[0].length - 1));
        }
        while (numberColumnSecond > mas[0].length - 1);

        changeColumn(numberColumnFirst, numberColumnSecond, mas);

        print(mas);
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

    private static int enterFromConsole(String message) {
        int value = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        boolean positiveNumber = false;
        while (!positiveNumber) {
            while (!sc.hasNextInt()) {
                System.out.print(message);
                sc.nextLine();
            }
            value = sc.nextInt();
            if (value >= 0) {
                positiveNumber = true;
            } else {
                System.out.print(message);
            }
        }
        return value;
    }

    private static void changeColumn(int first, int second, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int time;
            time = matrix[i][first];
            matrix[i][first] = matrix[i][second];
            matrix[i][second] = time;
        }
    }
}
