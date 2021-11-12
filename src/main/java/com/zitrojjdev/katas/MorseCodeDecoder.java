package com.zitrojjdev.katas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String[] allWordsInMorse = morseCode.trim().split("   ");
        StringBuilder builder = new StringBuilder();
        for (String w: allWordsInMorse
             ) {
            String[] letterInMorse = w.split(" ");
            for (String c:letterInMorse
                 ) {
                builder.append(MorseCode.get(c));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    /*
    * public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String word) {
        return Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
    }
    * */
}
