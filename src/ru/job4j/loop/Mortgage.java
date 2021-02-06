package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double restAmount = amount;
        while (restAmount > 0) {
            year++;
            restAmount = restAmount + restAmount  * percent / 100 - salary;
        }
        return year;
    }
}
