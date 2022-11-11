package ru.sayinfull.education.kyu7;

import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("asdqas dwqe"));

    }

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
