package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            int i = ivan *= 3;
            int n = nik *= 2;
            month++;
        }
        return month;
    }
}
