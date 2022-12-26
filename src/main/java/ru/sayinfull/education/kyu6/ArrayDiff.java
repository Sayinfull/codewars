package ru.sayinfull.education.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{2, 3, 5, 7})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list1.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            list2.add(b[i]);
        }
        list1.removeAll(list2);

        int[] newArray = new int[list1.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = list1.get(i);
        }
        return newArray;
    }
}
