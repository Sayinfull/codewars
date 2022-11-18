package ru.sayinfull.education.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class YouBeginner {
    public static void main(String[] args) {
        System.out.println(check(new Object[]{1, 2, 3, 4, 5, 6}, 6));
    }

    public static boolean check(Object[] a, Object x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) return true;
        }
        return false;
    }
}
