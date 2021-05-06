package by.training.programming_with_class.simple_class.test;
/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы
изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных,
и метод, который находит наибольшее значение из этих двух переменных.
*/

public class Test1 {
    private int first;
    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    public void print() {
        System.out.println(getFirst());
        System.out.println(getSecond());
    }

    public int sumOfFields() {
        return this.first + this.second;
    }

    public int maxOfField() {
        if (this.first >= this.second) {
            return first;
        } else {
            return second;
        }
    }


}
