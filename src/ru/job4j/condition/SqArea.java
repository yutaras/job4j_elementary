package ru.job4j.condition;

import static java.lang.Math.pow;

public class SqArea {
    public static double square(int p, double k) {
        return pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
