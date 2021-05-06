package by.training.fundamental.branching;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task3 {
    public static void main(String[] args) {

        int x1 = 2;
        int y1 = 0;
        int x2 = 4;
        int y2 = 1;
        int x3 = 8;
        int y3 = 3;

        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("Все три точки лежат на одной прямой.");
        } else {
            System.out.println("Три точки не лежат на одной прямой.");
        }
    }
}
