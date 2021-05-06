package by.training.fundamental.linear;

// true или false для точки с координатами (х, у)

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int x;
        int y;

        x = enterFromConsole("x >> ");
        y = enterFromConsole("y >> ");
        System.out.println(inArea(x, y));
    }

    private static int enterFromConsole(String message) {
        int value;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print(message);
            sc.nextLine();
        }
        value = sc.nextInt();
        return value;
    }

    private static boolean inArea(int x, int y) {
        boolean inArea = false;
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            inArea = true;
        }
        return inArea;
    }
}
