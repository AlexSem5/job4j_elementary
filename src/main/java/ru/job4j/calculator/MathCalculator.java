package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivision(double first, double second) {
        return subtract(first, second) + division(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtract(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("The sumAndMultiply result is: " + sumAndMultiply(10, 20));
        System.out.println("The subtractAndDivision result is: " + subtractAndDivision(10, 20));
        System.out.println("The allOperations result is: " + allOperations(10, 20));
    }
}
