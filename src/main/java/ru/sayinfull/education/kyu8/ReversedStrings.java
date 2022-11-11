package ru.sayinfull.education.kyu8;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));
    }
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
