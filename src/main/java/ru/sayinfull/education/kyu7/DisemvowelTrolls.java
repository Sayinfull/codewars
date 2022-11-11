package ru.sayinfull.education.kyu7;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("asdasdasaaaaaaaaadffqqwereeee"));
    }
    public static String disemvowel(String str) {
        String[] vowels = {"a","e","i","o","u","y","A","E","I","O","U","Y"};
        for (int i = 0; i < vowels.length; i++) {
            str = str.replace(vowels[i],"");
        }
        return str;
    }
}
