package by.training.fundamental.branching;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.

public class Task4 {
    public static void main(String[] args) {
        int weight = 5;
        int width = 3;
        int length = 9;
        int size1 = 5;
        int size2 = 4;
        String message;
        if (size1 >= weight && (size2 >= width || size2 >= length)) {
            message = "Кирпич пройдёт через отверстие";
        } else if (size1 >= width && (size2 >= weight || size2 >= length)) {
            message = "Кирпич пройдёт через отверстие";
        } else if (size1 >= length && (size2 >= weight || size2 >= width)) {
            message = "Кирпич пройдёт через отверстие";
        } else {
            message = "Кирпич не пройдёт через отверстие";
        }
        System.out.println(message);
    }

}
