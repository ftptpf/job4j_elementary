package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int n = 2;  n <= finish; n++) {
            if (CheckPrimeNumber.check(n)) {
                count++;
            }
        }
        return count;
    }
}