package ru.sayinfull.education.kyu8;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("john Richard"));
    }

    public static String abbrevName(String name) {
        String[] nameArray = name.split(" ");
        return nameArray[0].toUpperCase().charAt(0) + "." + nameArray[1].toUpperCase().charAt(0) + ".";
    }
}
