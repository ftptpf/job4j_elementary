package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int x = first > second ? first : second;
        int y = x > third ? x : third;
        return y;
    }
}
