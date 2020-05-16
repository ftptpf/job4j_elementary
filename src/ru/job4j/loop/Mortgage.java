package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        double debt = 0;
        while (debt >= 0) {
            debt = ((amount + (amount * (percent / 100))) - salary);
            amount = debt;
            year++;
        }
        return year;
    }
}
