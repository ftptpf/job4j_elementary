package ru.job4j.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 5;
        boolean result = first > second; // first > second ?
        System.out.println(result);
        result = first < second; // first < second ?
        System.out.println(result);
        result = first == second; // first == second ?
        System.out.println(result);
    }
}