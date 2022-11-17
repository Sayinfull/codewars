package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class BeginnerLostWithoutMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 3, 4})));
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
//        for (int i = 0; i < arr.length; i++)
//            arr[i] *= 2;
//
//        return arr;
    }
}
