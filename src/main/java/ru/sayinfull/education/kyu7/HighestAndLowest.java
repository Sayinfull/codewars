package ru.sayinfull.education.kyu7;

import java.util.Arrays;


public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3"));
    }

    public static String highAndLow(String numbers) {
        String[] arrays = numbers.split(" ");
        int[] arraysOfIntegers = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            arraysOfIntegers[i] = Integer.parseInt(arrays[i]);
        }
        Arrays.sort(arraysOfIntegers);
        return arraysOfIntegers[arraysOfIntegers.length - 1] + " " + arraysOfIntegers[0];
    }
}
