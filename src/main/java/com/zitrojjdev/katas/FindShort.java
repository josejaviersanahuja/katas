package com.zitrojjdev.katas;

import java.util.Arrays;

public class FindShort {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .summaryStatistics()
                .getMin();
    }

    /**
     *
     * public static int findShort(String s) {
     *     return Stream.of(s.split(" "))
     *       .mapToInt(String::length)
     *       .min()
     *       .getAsInt();
     * }
     *
     */

}
