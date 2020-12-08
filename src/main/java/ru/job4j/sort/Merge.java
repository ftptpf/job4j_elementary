package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rls = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length & j < right.length) {
            if (left[i] < right[j]) {
                rls[index] = left[i];
                i++;
            } else {
                rls[index] = right[j];
                j++;
            }
            index++;
        }
        while (i < left.length) {
            rls[index] = left[i];
            i++;
            index++;
        }
        while (j < right.length) {
            rls[index] = right[j];
            j++;
            index++;
         }
        return  rls;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rls = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rls));
    }
}