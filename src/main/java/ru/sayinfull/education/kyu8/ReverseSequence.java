package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class ReverseSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n--;
        }
        return array;
    }
}
