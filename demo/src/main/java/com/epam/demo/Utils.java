package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String item : args) {
            if (!StringUtils.isPositiveNumber(item)) {
                return false;
            }
        }
        return true;
    }
}