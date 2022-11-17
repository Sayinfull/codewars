package ru.sayinfull.education.kyu8;

public class OppositesAttract {
    public static void main(String[] args) {
        System.out.println(isLove(5, 6));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0);
    }
}
