package ru.sayinfull.education.kyu8;

public class CountOfPositivesOrSumNegatives {


    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int sumNegatives = 0, count = 0;
        for (int i : input) {
            if (i < 0) sumNegatives += i;
            if (i > 0) count++;
        }
        return new int[]{count, sumNegatives};
    }
}
