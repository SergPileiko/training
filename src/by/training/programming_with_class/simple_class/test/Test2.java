package by.training.programming_with_class.simple_class.test;

/* 2. Создайте класс Test2 двумя переменными.
Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса. */

public class Test2 {
    private int weight;
    private int height;

    public Test2(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Test2() {
        this.height = 170;
        this.weight = 60;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

}
