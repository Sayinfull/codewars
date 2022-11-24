package ru.sayinfull.education.kyu7;

public class GetMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("privet"));
    }
    public static String getMiddle(String word) {
        String[] split = word.split("");
        if (split.length % 2 != 0){
            return split[split.length/2];
        } else return split[split.length / 2 - 1] + split[split.length / 2];
    }
}
