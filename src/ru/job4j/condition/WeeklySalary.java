package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int sum1 = 0;
        int sum2 = 0;
        int sum;
        int amountMoneyOf1workday;
        int amountMoneyOf1weekend;
        for (int i = 0; i < hours.length - 2; i++) {
            if (hours[i] < 9) {
                amountMoneyOf1workday = hours[i] * 10;
            } else {
                amountMoneyOf1workday = 80 + (hours[i] - 8) * 15;
            }
            sum1 += amountMoneyOf1workday;
        }
        for (int i = hours.length - 2; i < hours.length; i++) {
            if (hours[i] < 9) {
                amountMoneyOf1weekend = hours[i] * 20;
            } else {
                amountMoneyOf1weekend = 160 + (hours[i] - 8) * 30;
            }
            sum2 += amountMoneyOf1weekend;
        }
        sum = sum1 + sum2;
        return sum;
    }
}
