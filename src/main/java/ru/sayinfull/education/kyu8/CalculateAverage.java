package ru.sayinfull.education.kyu8;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CalculateAverage {
//    public static double find_average(int[] array){
//        return Arrays.stream(array).average().orElse(0);
//    }

    public static void main(String[] args) {
        int[] array = {1,2};
        if (array == null) System.out.println(0);
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        double average = (sum/ array.length);
        System.out.println(new DecimalFormat("#0.00").format(average));
        System.out.println(Arrays.stream(array).average().orElse(0));
    }
}
