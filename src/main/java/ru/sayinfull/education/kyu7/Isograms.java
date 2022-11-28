package ru.sayinfull.education.kyu7;


import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("Hhelo"));
    }
    public static Boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
//        String str1 = str.toLowerCase();
//        Set<Character> set = new HashSet<>();
//        StringBuilder sb = new StringBuilder();
//        for (char c : str1.toCharArray()){
//            if (!set.contains(c)){
//                set.add(c);
//                sb.append(c);
//            }
//        }
//        return sb.toString().equals(str1);
    }
}
