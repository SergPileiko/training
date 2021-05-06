package by.training.algorithmization.decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.
public class Task4 {
    public static void main(String[] args) {
        int[] forX = new int[]{7, -10, 7, 8, -10, 1, 10, 10};
        int[] forY = new int[]{7, 10, 7, 5, -10, 2, -10, 10};
        int[] indexBidDistance;

        indexBidDistance = indexLongDistance(forX, forY);
        printCoordinate(indexBidDistance);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        double distance;
        double time1;
        double time2;

        time1 = Math.pow((x2 - x1), 2);
        time2 = Math.pow((y2 - y1), 2);
        distance = Math.pow((time1 + time2), 0.5);
        return distance;
    }

    private static int[] indexLongDistance(int[] forX, int[] forY) {
        if (forX.length != forY.length) {
            return null;
        }
        int[] index;
        int count = 0;
        double large = 0;
        int indexCoordinate = 0;
        int[] tempArray = new int[forX.length * 2];
        for (int i = 0; i < forX.length - 1; i++) {
            for (int j = i + 1; j < forY.length; j++) {
                double temp = distance(forX[i], forY[i], forX[j], forY[j]);
                if (temp > large) {
                    large = temp;
                }
            }
        }
        for (int i = 0; i < forX.length - 1; i++) {
            for (int j = i + 1; j < forY.length; j++) {
                double temp = distance(forX[i], forY[i], forX[j], forY[j]);
                if (temp == large) {
                    count++;
                    tempArray[indexCoordinate] = i;
                    indexCoordinate++;
                    tempArray[indexCoordinate] = j;
                    indexCoordinate++;
                }
            }
        }
        index = new int[count * 2];
        for (int i = 0; i < index.length; i++) {
            index[i] = tempArray[i];
        }
        return coordinateByIndex(forX, forY, index);
    }

    private static int[] coordinateByIndex(int[] forX, int[] forY, int[] index) {
        int[] coordinate = new int[index.length * 2];
        int j = 0;
        for (int i = 0; i < coordinate.length - 1; i += 2) {
            coordinate[i] = forX[index[j]];
            coordinate[i + 1] = forY[index[j]];
            j++;
        }
        return coordinate;
    }

    private static void printCoordinate(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        System.out.println("Наибольшее расстояние между точками:");
        for (int i = 0; i < array.length - 3; i += 2) {
            System.out.print("(" + array[i] + ", " + array[i + 1] + ")");
            i += 2;
            System.out.println(" and (" + array[i] + ", " + array[i + 1] + ")");
        }
    }

    private static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int i = 0;
        for (; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);
    }
}
