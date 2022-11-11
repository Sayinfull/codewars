package ru.sayinfull.education.kyu8;

public class Correct {
    public static String correct(String string) {
        return string.replaceAll("[1]", "I").
                replaceAll("[0]", "O").
                replaceAll("[5]", "S");
    }
}
