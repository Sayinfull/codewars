package ru.sayinfull.education.kyu8;

public class ReduceGrow {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3,4}));
    }
    public static int grow(int[] x){
        int result = 1;
        for(int i = 0; i < x.length; i++)
            result= result * x[i];
        return result;
    }
}
