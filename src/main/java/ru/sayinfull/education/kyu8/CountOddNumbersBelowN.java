package ru.sayinfull.education.kyu8;

public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
        int count = 0;

        if (n > 0 || n % 2 == 0) {
            count++;
        }
        return count;
    }
}
