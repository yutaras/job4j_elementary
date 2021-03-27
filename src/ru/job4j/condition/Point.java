package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 -x1;
        int y = y2 - y1;
        double z1 = Math.pow(x, 2);
        double z2 = Math.pow(y, 2);
        double z = z1 + z2;
        double rsl = Math.sqrt(z);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
    }
}
