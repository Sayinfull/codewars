package ru.sayinfull.education.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferencesInArray {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 8, 11, 7};
        //      Arrays.sort(array);
        int buffer;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    buffer = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buffer;
                }
            }
        }
        if (array != null || array.length != 1) {
            for (int i = 0; i < array.length-1; i++) {
                sum = sum +  array[i] - array[i + 1];
            }
        }
        System.out.println(sum);
    }
}
