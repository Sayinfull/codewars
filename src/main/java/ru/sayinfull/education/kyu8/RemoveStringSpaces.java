package ru.sayinfull.education.kyu8;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("Hello World. My name is Salikh."));
    }
    public static String noSpace(final String x) {
        return x.replaceAll("\\s",""); // можно еще \\w
    }
}
