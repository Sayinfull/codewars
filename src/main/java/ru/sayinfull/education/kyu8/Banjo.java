package ru.sayinfull.education.kyu8;

import java.util.stream.IntStream;

public class Banjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Sob"));
    }

    public static String areYouPlayingBanjo(String name) {

        return name.charAt(0) == 'R' || name.charAt(0) == 'r' ? name + " plays banjo" : name + " does not play banjo";

    }
}
