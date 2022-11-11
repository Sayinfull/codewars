package ru.sayinfull.education.kyu8;

public class ReturningStrings {
    public static String greet(String name){
        return "Hello, " + name + " how are you doing today?";
    }

    public static void main(String[] args) {
        String name = "Sos";
        System.out.println(greet(name));
    }
}
