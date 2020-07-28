package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double result = amount;
        while (result > 0) {
            result = result + result * percent / 100 - salary;
            year++;
        }
        return year;
    }
}