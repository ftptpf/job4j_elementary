package ru.job4j.condition;


public class Max {
    //возврат максимального значения
    public static int max(int left, int right) {
        int result = left > right ?  left : right;
        return result;
    }
}