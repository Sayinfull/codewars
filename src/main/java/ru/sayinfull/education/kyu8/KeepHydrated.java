package ru.sayinfull.education.kyu8;

public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(Liters(9.9));
    }
    public static int Liters(double time)  {

        return (int) Math.floor(time*0.5);

    }
}
