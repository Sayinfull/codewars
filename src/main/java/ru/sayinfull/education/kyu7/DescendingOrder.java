package ru.sayinfull.education.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(142530));
    }

    public static int sortDesc(final int num) {
        char[] chars = String.valueOf(num).toCharArray();
        List<Integer> integers = new ArrayList<>();
        for (char aChar : chars) {
            integers.add(Integer.parseInt(String.valueOf(aChar)));
        }
        integers.sort(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : integers) {
            stringBuilder.append(i);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}

