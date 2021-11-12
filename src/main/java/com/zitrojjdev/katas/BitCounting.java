package com.zitrojjdev.katas;

import java.util.Arrays;

public class BitCounting {
    public static int countBits(int n){
        String numStr = Integer.toBinaryString(n);
        int sum = (int)Arrays.stream(numStr.split(""))
                .mapToInt(Integer::parseInt)
                .summaryStatistics()
                .getSum();

        return sum;
    }
    /**
     *
     public static int countBits(int n){

        return Integer.bitCount(n);
     }

     public static int countBits(int n){
         int ret = n % 2;
         while ((n /= 2) > 0) ret += n % 2;
         return ret;
     }

     public static int countBits(int n){
         return (int) Integer.toBinaryString(n).chars()
                     .filter(c -> c == '1')
                     .count();
     }

     public static int countBits(int n) {
         int i = 0;

         for (int j = n; j > 0; j >>= 1) {
         i += j & 1;
         }

         return i;
     }

     public static int countBits(int n){
         String s = Integer.toBinaryString(n);
         return  s.length() - s.replace("1", "").length();
     }
     */

    public static void main(String[] args) {
        System.out.println(countBits(1023));
    }
}
