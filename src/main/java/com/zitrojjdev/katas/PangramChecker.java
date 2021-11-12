package com.zitrojjdev.katas;


import java.util.stream.IntStream;

public class PangramChecker {
    public boolean check(String sentence){
        final String allLetters = "abcdefghijklmnopqrstuvwxyz";
        String[] split = allLetters.split("");
        boolean result = true;
        for (String s: split
             ) {
            result = result && sentence.toLowerCase().contains(s);
            if (!result) break;
        }
        return result;
    }

    /*
    *
    * public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

      }
      *
      public boolean check(String sentence){
        return sentence.chars()
                    .map(Character::toLowerCase)
                    .filter(Character::isAlphabetic)
                    .distinct()
                    .count() == 26;
      }
    * */
}
