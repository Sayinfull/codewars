package ru.sayinfull.education.kyu7;

public class CatsShelves {
    public static void main(String[] args) {
        System.out.println(solution(703, 741));
    }

    public static int solution(int start, int finish) {
        return (finish - start)/3 + ((finish - start) % 3);
    }
}
