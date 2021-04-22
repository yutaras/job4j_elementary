package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int s = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            s += 1;
        }
        for (int i = 0; i < right.length; i++) {
            rsl[s] = right[i];
            s += 1;
        }
        return rsl;
    }
}
