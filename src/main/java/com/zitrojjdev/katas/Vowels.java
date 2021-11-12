package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = (int)Arrays.stream(str.split(""))
                                .mapToInt(s->{
                                    if (isVowel(s)) return 1;
                                    return 0;
                                })
                                .summaryStatistics()
                                .getSum();
        return vowelsCount;
    }

    /**
     *
     * public static int getCount(String str) {
     *         return str.replaceAll("(?i)[^aeiou]", "").length();
     *     }
     *
     * public static int getCount(String str) {
     *     int vowelsCount = 0;
     *
     *     for(char c : str.toCharArray())
     *       vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
     *
     *     return vowelsCount;
     *   }
     *
     *   public static int getCount(String str) {
     *     return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
     *   }
     *
     *
     *
     */
    public static boolean isVowel (String s){
        return s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u");
    }

    public static void main(String[] args) {
        getCount("hgajhga");
    }
}
