package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        boolean can = left > right;
        result = can ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int max = Max.max(10, 10);
        System.out.println(max);
    }
}
