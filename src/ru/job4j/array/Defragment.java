package ru.job4j.array;

import org.hamcrest.generator.qdox.tools.QDoxTester;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = point; j < array.length; j++) {
                    if (array[j] != null) {
                        int dot = j;
                        String temp = array[point];
                        array[point] = array[dot];
                        array[dot] = temp;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}