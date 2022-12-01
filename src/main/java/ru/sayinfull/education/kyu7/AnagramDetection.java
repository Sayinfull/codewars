package ru.sayinfull.education.kyu7;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetection {
    public static void main(String[] args) {
        System.out.println(isAnagram("Buckethead", "DeathCubeK"));
    }

    public static boolean isAnagram(String test, String original) {
        String[] array1 = test.toLowerCase().split("");
        String[] array2 = original.toLowerCase().split("");
        Arrays.sort(array1);
        Arrays.sort(array2);
//        String newTest = Arrays.toString(array1).toLowerCase();
//        String newOriginal = Arrays.toString(array2).toLowerCase();
//        return newTest.contains(newOriginal);
        return Arrays.toString(array1).contains(Arrays.toString(array2));
    }
}
