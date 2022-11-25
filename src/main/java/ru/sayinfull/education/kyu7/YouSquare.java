package ru.sayinfull.education.kyu7;

public class YouSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(0));
    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n) && n >= 0;
    }
}
