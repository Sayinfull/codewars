package ru.sayinfull.education.kyu8;

import java.text.DecimalFormat;

public class AreaOfSquare {
    public static double squareArea(double A) {
        return Double.parseDouble(new DecimalFormat("#0.00").format((Math.pow((A * 4) / (2 * Math.PI),2))));

    }
}
