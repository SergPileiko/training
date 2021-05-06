package by.training.fundamental.cycle;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

    public static void main(String[] args) {
        char c;

        for (int i = 0; i < 300; i++) {
            c = (char) i;
            System.out.println("Символу " + c + " соответствует численное значение: " + i);
        }
    }
}
