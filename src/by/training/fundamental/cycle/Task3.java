package by.training.fundamental.cycle;

// Найти сумму квадратов первых ста чисел.

public class Task3 {
    public static void main(String[] args) {
        int i;
        double sum = 0;

        for (i = 0; i <= 100; i++) {
            sum = sum + Math.pow(i, 2);
        }

        System.out.println("Сумма квадратов первых 100 чисел равна " + sum);
    }
}
