package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] mas = new int[3][3];
        int k = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = k;
                k++;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}