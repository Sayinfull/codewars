package ru.sayinfull.education.kyu7;

import java.util.Arrays;

public class LargestElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})));
    }

    public static int[] largest(int n, int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int[] newArray = new int[n];
        for (int i = arr.length - n; i < arr.length; i++) {
            newArray[count] = arr[i];
            count++;
        }
        return newArray;
    }
}
