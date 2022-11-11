package ru.sayinfull.education.kyu8;

public class EnoughSpace {
    public static int enough(int cap, int on, int wait) {
        return Math.max(0, on + wait - cap);
    }
}
