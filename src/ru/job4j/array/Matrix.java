package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                array[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = multiple(4);
        for (int[] ints : array) {
            for (int cell = 0; cell < array.length; cell++) {
                System.out.print(ints[cell] + " ");
            }
            System.out.println();
        }
    }
}
