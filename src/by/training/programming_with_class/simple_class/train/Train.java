package by.training.programming_with_class.simple_class.train;
// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.

import java.util.Comparator;

public class Train {
    private String destination;
    private int time;
    private int number;

    public Train() {
    }

    public Train(String destination, int time, int number) {
        this.destination = destination;
        this.time = time;
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public int getTime() {
        return time;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (time != train.time) return false;
        if (number != train.number) return false;
        return destination != null ? destination.equals(train.destination) : train.destination == null;
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + time;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", time=" + time +
                ", number=" + number +
                '}';
    }

    public static Comparator<Train> myComparatorForNumber = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return Double.compare(o1.getNumber(), o2.getNumber());
        }
    };

}
