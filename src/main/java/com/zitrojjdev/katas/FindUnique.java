package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindUnique {
    public static double findUnique(double[] arr){
        OptionalDouble max = Arrays.stream(arr).max();
        OptionalDouble min = Arrays.stream(arr).min();
        if (max.getAsDouble() > arr[0] && max.getAsDouble() > arr[1]) return max.getAsDouble();
        if (min.getAsDouble() < arr[0] && min.getAsDouble() < arr[1]) return min.getAsDouble();
        if (arr[0] == arr[2]) return arr[1];
        return arr[0];
    }

    /**
     *
     * public static double findUniq(double[] arr) {
     *       Arrays.sort(arr);
     *       return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
     *     }
     *
     *
     */

     public static void main(String[] args) {
        System.out.println(findUnique(new double[]{0, 1, 0}));
    }
}


