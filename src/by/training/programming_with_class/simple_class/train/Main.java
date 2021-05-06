package by.training.programming_with_class.simple_class.train;
// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numberFromConsole;
        List<Train> trains = new ArrayList<Train>();
        Train train1 = new Train("Минск", 15, 123);
        Train train2 = new Train("Варшава", 13, 541);
        Train train3 = new Train("Минск", 10, 773);
        Train train4 = new Train("Москва", 11, 293);
        Train train5 = new Train("Варшава", 10, 213);

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);

        printTrains(trains);
        System.out.println("__________");
        sortNumber(trains);
        printTrains(trains);

        numberFromConsole = Enter.enterFromConsole("Введите номер поезда >>");

        printAboutTrain(infoAboutTrain(trains, numberFromConsole));

        sortForDestination(trains);
        printTrains(trains);
    }

    public static void sortNumberColl(List<Train> list) {
        Collections.sort(list, Train.myComparatorForNumber);
    }

    public static void printTrains(List<Train> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("пункт назначени: " + list.get(i).getDestination() + ". Время отправления " + list.get(i).getTime());
            System.out.print(". Номер поезда " + list.get(i).getNumber() + "\n");
        }
    }

    public static void printAboutTrain(Train tr) {
        if (tr == null) {
            System.out.println("Нет такого поезда!");
            return;
        }
        System.out.print("пункт назначени: " + tr.getDestination() + ". Время отправления " + tr.getTime());
        System.out.print(". Номер поезда " + tr.getNumber() + "\n");

    }

    public static void sortNumber(List<Train> list) {
        boolean sorted = false;

        while (!sorted) {
            Train temp;
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getNumber() > list.get(i + 1).getNumber()) {
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                    sorted = false;
                }
            }
        }
    }

    public static Train infoAboutTrain(List<Train> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumber() == number) {
                return list.get(i);
            }
        }
        return null;
    }

    public static void sortForDestination(List<Train> list) {
        boolean sorted = false;
        boolean sorted2 = false;
        while (!sorted) {
            Train temp;
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getDestination().compareToIgnoreCase(list.get(i + 1).getDestination()) > 0) {
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                    sorted = false;
                }
            }
        }
        while (!sorted2) {
            Train temp;
            sorted2 = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getDestination().compareToIgnoreCase(list.get(i + 1).getDestination()) == 0) {
                    if (list.get(i).getTime() > list.get(i + 1).getTime()) {
                        temp = list.get(i + 1);
                        list.set(i + 1, list.get(i));
                        list.set(i, temp);
                        sorted2 = false;
                    }
                }
            }
        }
    }
}
