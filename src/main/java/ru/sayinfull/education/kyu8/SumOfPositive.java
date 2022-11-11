package ru.sayinfull.education.kyu8;

public class SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,-3,2,3}));
    }
    public static int sum(int[] arr){
        if (arr == null) return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
