package ru.sayinfull.education.kyu8;


import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }

    public static String reverseWords(String str) {
//        return new StringBuilder(str).reverse().toString();
        String[] array = str.split(" ");
        StringBuilder temp = new StringBuilder();
        temp.append(array[array.length - 1]);
        for (int i = array.length - 2; i >= 0; i--) {
                temp.append(" ").append(array[i]);
        }
        return temp.toString();
    }
}
