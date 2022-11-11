package ru.sayinfull.education.kyu8;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("Hello"));
    }

    public static String remove(String str) {
//        return str.substring(1,str.length()-1);
        return new StringBuilder(str).deleteCharAt(str.length()-1).deleteCharAt(0).toString();

    }
}
