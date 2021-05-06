package by.training.programming_with_class.simple_class.student;
/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Student {
    private String surName;
    private String name;
    private int groupNumber;
    private int[] performance;

    public Student(String surname, String name, int groupNumber, int[] performance) {
        this.surName = surname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.performance = performance;
    }

    public String getSurname() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }
}
