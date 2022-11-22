package ru.sayinfull.education.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(3234));
    }

    public static int squareDigits(int n) {
        String s = String.valueOf(n);
        int x = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            x = (int) Math.pow(s.charAt(i) - 48, 2);
            result.append(x);
        }
        return Integer.parseInt(result.toString());
    }
}
