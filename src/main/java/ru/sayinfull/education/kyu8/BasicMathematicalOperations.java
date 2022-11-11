package ru.sayinfull.education.kyu8;

public class BasicMathematicalOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("*", 2, 2));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "-":
                return v1 - v2;
            case "+":
                return v1 + v2;
            case "/":
                return v1 / v2;
            case "*":
                return v1 * v2;
            default:
                return 0;
        }
    }
}
