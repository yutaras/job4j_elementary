package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i > left.length - 1) {
                int temp = right[j];
                rsl[k] = temp;
                j++;
            } else if (j > right.length - 1) {
                int temp = left[i];
                rsl[k] = temp;
                i++;
            } else if (left[i] < right[j]) {
                int temp = left[i];
                rsl[k] = temp;
                i++;
            } else {
                int temp = right[j];
                rsl[k] = temp;
                j++;
            }
        }
        return rsl;
    }
}
