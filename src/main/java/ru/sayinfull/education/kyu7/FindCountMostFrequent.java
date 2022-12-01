package ru.sayinfull.education.kyu7;

import java.util.Arrays;

public class FindCountMostFrequent {
    public static void main(String[] args) {
        System.out.println(mostFrequentItemCount(new int[]{-5, 6, -7, 0, -1, -9, -11, 11, 11, -14, 1, 8}));
    }

    public static int mostFrequentItemCount(int[] collection) {
        if (collection == null || collection.length == 0) return 0;
        Arrays.sort(collection);
        int count = 1;
        int maxCount = 1;
        int previous = collection[0];
        int popular = 0;

        for (int i = 1; i < collection.length; i++) {
            if (previous == collection[i]) {
                count++;
            } else {
                if (count > maxCount) {
                    popular = collection[i - 1];
                    maxCount = count;

                }
                count = 1;
                previous = collection[i];
            }
        }
        return Math.max(count, maxCount);
    }
}
