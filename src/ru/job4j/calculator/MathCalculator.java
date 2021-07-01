package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + multiply(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета функции 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета функции 2 равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета функции 3 равен: " + allOperations(10, 20));
    }
}
