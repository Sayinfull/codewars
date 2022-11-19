package ru.sayinfull.education.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{1.1, 2.2, 3.3}));
    }
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
//        double sum = 0;
//        if (numbers == null) return 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        return sum;
    }
}
