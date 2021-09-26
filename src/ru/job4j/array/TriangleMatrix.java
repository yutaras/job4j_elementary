package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int element = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = element++;
            }
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rows(5)));
    }
}
