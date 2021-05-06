package by.training.programming_with_class.simple_class.student;

public class Main {

    public static void main(String[] args) {
        Student[] listStudent = new Student[10];
        listStudent[0] = new Student("Васильев", "А.В.", 1, new int[]{6, 7, 8, 9, 5});
        listStudent[1] = new Student("Петров", "И.К.", 1, new int[]{9, 9, 9, 8, 6});
        listStudent[2] = new Student("Соколов", "М.А.", 2, new int[]{5, 8, 7, 9, 5});
        listStudent[3] = new Student("Михайлов", "И.И.", 3, new int[]{9, 9, 9, 9, 10});
        listStudent[4] = new Student("Новиков", "Ф.А.", 2, new int[]{9, 9, 9, 10, 10});
        listStudent[5] = new Student("Фёдоров", "А.А.", 3, new int[]{5, 9, 10, 10, 6});
        listStudent[6] = new Student("Иванов", "Т.Т.", 3, new int[]{9, 9, 9, 9, 10});
        listStudent[7] = new Student("Смирнов", "Е.В.", 2, new int[]{9, 9, 9, 9, 10});
        listStudent[8] = new Student("Кузнецов", "В.С.", 1, new int[]{9, 9, 9, 9, 10});
        listStudent[9] = new Student("Андреев", "С.М.", 1, new int[]{8, 5, 5, 5, 6});

        for (int i = 0; i < listStudent.length; i++) {
            boolean excellentStudent = true;
            for (int j = 0; j < listStudent[i].getPerformance().length; j++) {
                if (listStudent[i].getPerformance()[j] < 9) {
                    excellentStudent = false;
                }
            }
            if (excellentStudent) {
                printNameAndGroup(listStudent[i].getSurname(), listStudent[i].getGroupNumber());
            }
        }
    }

    public static void printNameAndGroup(String surname, int group) {
        System.out.println("Студент " + surname + " из группы " + group + " отличник");

    }

}
