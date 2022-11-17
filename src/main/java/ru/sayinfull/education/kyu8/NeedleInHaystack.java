package ru.sayinfull.education.kyu8;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class NeedleInHaystack {
    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"asd","qwe", "needle"}));
    }
    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle"){
                index = i;
            }
        }
        return "found the needle at position " + index;

    }
}
