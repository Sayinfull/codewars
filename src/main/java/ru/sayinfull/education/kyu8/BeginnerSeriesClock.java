package ru.sayinfull.education.kyu8;

public class BeginnerSeriesClock {
    public static void main(String[] args) {
        System.out.println(Past(1,1,10));
    }
    public static int Past(int h, int m, int s) {
        return ((h*60 + m)*60 + s)*1000;

    }
}
