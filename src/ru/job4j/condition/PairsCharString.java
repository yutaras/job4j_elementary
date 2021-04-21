package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        boolean result = false;
        if (l.equals("") && r.equals("") || (l.charAt(0) == r.charAt(r.length() - 1) && (r.charAt(0) == l.charAt(l.length() - 1)))) {
            result = true;
        }
        return result;
    }
}
