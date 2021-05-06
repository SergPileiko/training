package by.training.programming_with_class.simple_class.test;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setFirst(6);
        test1.setSecond(4);
        test1.print();
        System.out.println(test1.maxOfField());
        System.out.println(test1.sumOfFields());

        Test2 test2 = new Test2();
        System.out.println("weight = " + test2.getWeight() + "\nheight = " + test2.getHeight() + "\n ");
        test2.setHeight(165);
        test2.setWeight(65);
        System.out.println("weight = " + test2.getWeight() + "\nheight = " + test2.getHeight() + "\n ");

        Test2 test22 = new Test2(70, 180);
        System.out.println("weight = " + test22.getWeight() + "\nheight = " + test22.getHeight() + "\n ");

    }
}
