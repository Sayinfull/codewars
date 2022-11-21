package ru.sayinfull.education.kyu8;

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }

    public static String bmi(double weight, double height) {

        double result = weight / Math.pow(height, 2);
        if (result <= 18.5)
            return "Underweight";
        if (result <= 25)
            return "Normal";
        if (result <= 30)
            return "Overweight";
        if (result > 30)
            return "Obese";
        return "";
    }
}
