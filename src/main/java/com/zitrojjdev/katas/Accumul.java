package com.zitrojjdev.katas;

import java.util.Locale;

public class Accumul {
    public static String accum(String s) {
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            result+=s.substring(i,i+1).toUpperCase();
            for (int j = 0; j < i; j++) {
                result+=s.substring(i,i+1).toLowerCase();
            }
            if (i+1<s.length()) result+="-";
        }
        return result;
    }

    /**
     *
     public static String accum(String s) {
         StringBuilder bldr = new StringBuilder();
         int i = 0;
         for(char c : s.toCharArray()) {
             if(i > 0) bldr.append('-');
             bldr.append(Character.toUpperCase(c));
             for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
             i++;
         }
         return bldr.toString();
     }

     public static String accum(String s) {
         s = s.toLowerCase();
         StringBuilder builder = new StringBuilder();

         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             builder.append(Character.toUpperCase(ch));
             for (int j = 0; j < i; j++) {
                builder.append(ch);
             }
             builder.append("-");
         }

         return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
     }


     *
     */


    public static void main(String[] args) {
        System.out.println(accum("abC"));
    }
}
