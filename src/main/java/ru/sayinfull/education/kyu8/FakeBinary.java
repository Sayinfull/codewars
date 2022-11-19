package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("12980723984723782657929312"));
    }

    public static String fakeBin(String numberString) {
        char[] array = numberString.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 52) {
                array[i] = '0';
            } else array[i] = '1';
        }
        return new String(array);
    }
}
