package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isBlank()) {
            return false; // Empty or null string is not a positive number
        }

        try {
            double number = Double.parseDouble(str);
            return number > 0;
        } catch (NumberFormatException e) {
            return false; // Unable to parse as a number
        } //here magic will happen
    }
}
