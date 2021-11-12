package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigPow {
    public static long digPow(int n, int p) {
        String numString = Integer.toString(n);
        int finalSum = 0;
        for (int i = 0; i < numString.length(); i++) {
            int digit = Integer.parseInt(numString.substring(i, i + 1));
            finalSum += Math.pow(digit, p+i);
        }
        return finalSum % n == 0 ? finalSum/n : -1;
    }

    /*
    public static long digPow(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
        return sum % n == 0 ? sum / n : -1;
    }

    */
    public static void main(String[] args) {

        System.out.println(digPow(695,2));
    }
}
