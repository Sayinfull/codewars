package ru.sayinfull.education.kyu8;

public class WayToPump {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        if (distanceToPump - (mpg * fuelLeft) <= 0) {
            return true;
        } else return false;
    }
}
