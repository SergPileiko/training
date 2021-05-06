package by.training.fundamental.linear;

//натуральное число Т времени в секундах Вывести ННч ММмин SSc.

public class Main5 {

    public static void main(String[] args) {
        int t;
        t = 64300;
        HowTime(t);
    }

    private static void HowTime(int allSec) {
        int sec;
        int tempMin;
        int min;
        int hour;

        sec = allSec % 60;
        tempMin = (allSec - sec) / 60;
        min = tempMin % 60;
        hour = (tempMin - min) / 60;

        System.out.print(hour + "ч " + min + "мин " + sec + "с");
    }
}
