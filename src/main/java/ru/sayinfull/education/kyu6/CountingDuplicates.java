package ru.sayinfull.education.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    public static int duplicateCount(String text) {
//        int count = 0;
//        int temp = 1;
//        String[] array = text.toLowerCase().split("");
//
//        Arrays.sort(array);
//
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i].equals(array[i + 1])) {
//                ++temp;
//            } else if (temp > 1) {
//                ++count;
//                temp = 1;
//            }
//        }
//        return count;

        int counter = 0;
        Map<String, Integer> map = new HashMap<>();
        String[] splitArray = text.toLowerCase().split("");
        for (String s1 : splitArray) {
            if (!s1.isEmpty()) {
                Integer count = map.get(s1);
                if (count == null) count = 0;
                map.put(s1, ++count);
            }
        }
        for (int i : map.values()) {
            if (i > 1) {
                counter++;
            }
        }
        return counter;
    }
}
