package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1, -2, 3, 4, 5, 6})));
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
//        for (int i = 0; i < array.length; i++) {
//            array[i] *= (-1);
//        }
//        return array;
    }
}
