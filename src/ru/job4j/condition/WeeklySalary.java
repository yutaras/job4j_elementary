package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int sum1 = 0;
        int sum2 = 0;
        int sum;
        int money1;
        int money2;
        for (int i = 0; i < hours.length - 2; i++) {
            if (hours[i] < 9) {
                money1 = hours[i] * 10;
            } else {
                money1 = 80 + (hours[i] - 8) * 15;
            }
            sum1 += money1;
        }
        for (int i = hours.length - 2; i < hours.length; i++) {
            if (hours[i] < 9) {
                money2 = hours[i] * 20;
            } else {
                money2 = 160 + (hours[i] - 8) * 30;
            }
            sum2 += money2;
        }
        sum = sum1 + sum2;
        return sum;
    }
}
