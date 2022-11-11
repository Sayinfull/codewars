package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class FindTheSmallestIntegerInTheArray {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{-10, 2, 34, 42, 5, 64, 75, 8}));
    }

    public static int findSmallestInt(int[] args) {
//        return Arrays.stream(args).min().getAsInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}
