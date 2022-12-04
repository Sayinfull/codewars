package ru.sayinfull.education.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NumbersWhichSumPowersDigitsSameNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eqSumPowDig(500, 3)));
    }

    public static Long[] eqSumPowDig(long hmax, int exp) {
        List<Long> list = new ArrayList();
        double sum = 0;
        for (int i = 2; i <= hmax; i++) {
            String[] s = String.valueOf(i).split("");
            for (int j = 0; j < s.length; j++) {
                sum += Math.pow(Double.parseDouble(s[j]), exp);
            }
            if (sum == i) {
                list.add((long) sum);
            }
            sum = 0;
        }
        return list.toArray(new Long[0]);

    }
}
 