package ru.sayinfull.education.kyu8;

import java.util.Arrays;

public class HowGoodYouReally {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++)
            sum += classPoints[i];

        return (sum / classPoints.length) < yourPoints;
    }
}
