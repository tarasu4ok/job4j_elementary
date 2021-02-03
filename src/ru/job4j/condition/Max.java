package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return  left > right ? left : right;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = Max.max(a, b);
        System.out.println("Максимальное из двух чисел " + a + " и " + b + ": " + result);
    }
}
