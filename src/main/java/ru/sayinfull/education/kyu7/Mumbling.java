package ru.sayinfull.education.kyu7;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        String[] array = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    sb.append(array[i].toUpperCase());
                } else sb.append(array[i]);
            }
            if (i != array.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
