package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class ConvertNumberToReversedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(2478)));
    }

    public static int[] digitize(long n) {
        String s = String.valueOf(n);

        int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(s.length() - i - 1) - 48;
        }
        return array;
    }
}
