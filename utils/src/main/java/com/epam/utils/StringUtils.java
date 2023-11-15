package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }

        if (str.startsWith("+")) {
            return isPositiveNumber(str.substring(1));
        }

        if (str.startsWith("-") || (str.startsWith("0") && !str.startsWith("0."))) {
            return false;
        }
        try {
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException e) {
            return false; // Parsing failed, not a valid number
        }
    }
}
