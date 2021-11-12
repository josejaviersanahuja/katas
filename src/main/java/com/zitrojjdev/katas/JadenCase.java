package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null) return null;
        if (phrase.equals("")) return null;
        String result = Arrays.stream(phrase.split(" "))
                .map(word -> {
                    String[] splitWord = word.split("");
                    splitWord[0] = splitWord[0].toUpperCase();//Locale.ROOT)
                    String newWord = Arrays.stream(splitWord).collect(Collectors.joining());
                    return newWord;
                })
                .collect(Collectors.joining(" "));

        return result;
    }

    /**
     * public String toJadenCase(String phrase) {
     *       if (null == phrase || phrase.length() == 0) {
     *           return null;
     *       }
     *
     *       return Arrays.stream(phrase.split(" "))
     *                    .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
     *                    .collect(Collectors.joining(" "));
     *   }
     *
     *
     * public String toJadenCase(String phrase) {
     *
     *     if(phrase == ""){
     *       return null;
     *     }
     *     else{
     *       return WordUtils.capitalize(phrase);
     *     }
     *   }
     *
     *   */
    public static void main(String[] args) {
        String s = toJadenCase("ahora si se puede");
        System.out.println(s);
    }
}
