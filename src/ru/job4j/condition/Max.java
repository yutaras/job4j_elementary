package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int max = Max.max(90, 150);
        System.out.println(max);
    }
}
