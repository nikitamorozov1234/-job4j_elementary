package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divisionAndSub(double first, double second) {
        return division(first, second)
                + sub(first, second);
    }

    public static double sumAndMultiplyAndDivisionAndSub(double first, double second) {
        return  sum(first, second)
                + multiply(first, second)
                + division(first, second)
                + sub(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divisionAndSub(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDivisionAndSub(10, 20));
    }
}