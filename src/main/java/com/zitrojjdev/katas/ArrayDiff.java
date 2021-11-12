package com.zitrojjdev.katas;


import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        IntStream stream = Arrays.stream(a);

        for (int i:b
             ) {
            stream = stream.filter(e-> e!=i);
        }

        return stream.toArray();
    }

    /*
    * public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
    *
    *
    *   public static int[] arrayDiff(int[] a, int[] b) {
            return IntStream.of(a)
                    .filter(x -> IntStream.of(b).noneMatch(y -> y == x))
                    .toArray();
        }
    *
    * */
    public static void main(String[] args) {
        int[] ints =arrayDiff(new int[]{1, 2}, new int[]{1});
        Arrays.stream(ints).forEach(System.out::println);
    }
}

