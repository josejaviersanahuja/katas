package com.zitrojjdev.katas;

import java.util.Arrays;

public class DRoot {
    public static int digital_root(int n) {
        String numString = Integer.toString(n);
        if (numString.length() == 1) return n;
        int nextInt = Arrays.stream(numString.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        return digital_root(nextInt);
    }
}
