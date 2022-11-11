package ru.sayinfull.education.kyu7;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] mass = {12, 5, 17, 6, 16, 7};
        boolean isSorted = false;
        int buf;
        while(isSorted==false) {
            isSorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    isSorted = false;
                    buf = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
