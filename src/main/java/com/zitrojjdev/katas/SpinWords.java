package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {

        return Arrays.stream(sentence.split(" "))
                .map(str -> {
                    if(str.length()<5) return str;
                    StringBuilder builder = new StringBuilder(str);
                    return builder.reverse().toString();
                })
                .collect(Collectors.joining(" "));
    }
}
