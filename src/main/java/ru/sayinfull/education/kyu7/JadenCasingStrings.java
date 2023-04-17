package ru.sayinfull.education.kyu7;

public class JadenCasingStrings {
    public static void main(String[] args) {
        JadenCasingStrings jadenCasingStrings = new JadenCasingStrings();
        System.out.println(jadenCasingStrings
                .toJadenCase("toJadenCase doesn't return a valide JadenCase String! try again please :)"));

    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for (int x = 0; x < array.length; x++) {
            if (x == 0 || array[x - 1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }
        return new String(array);
    }
}
