package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double restAmount = amount;
        while (restAmount + restAmount * percent / 100 > salary) {
            year++;
            restAmount = restAmount + restAmount  * percent / 100 - salary;
        }
        return year;
    }
}
