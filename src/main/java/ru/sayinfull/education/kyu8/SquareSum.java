package ru.sayinfull.education.kyu8;

public class SquareSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i : n) {
            sum += i * i;
        }
        return sum;
    }
}
