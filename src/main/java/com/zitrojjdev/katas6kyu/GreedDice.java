package com.zitrojjdev.katas6kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GreedDice {
/*
    private static HashMap<Integer, Integer > scoreThreeInTable(){
        HashMap<Integer, Integer> result = new HashMap<>();
        result.put(1,1000);
        result.put(2,200);
        result.put(3,300);
        result.put(4,400);
        result.put(5,500);
        result.put(6,600);
        return result;
    }
    private static HashMap scoreOneInTable(){
        HashMap<Integer, Integer> result = new HashMap<>();
        result.put(1, 100);
        result.put(2, 0);
        result.put(3, 0);
        result.put(4, 0);
        result.put(5, 50);
        result.put(6, 0);
        return result;
    }
    public static int greedy(int[] dice){
        // lets find  if there is a number repeated 3 times
        int finalScore= 0;
        List<Integer> collect = Arrays.stream(dice)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        // Create 4 conditional actions depending on if we find threesomes or not
        if ((int)collect.get(0) == (int)collect.get(2) && (int)collect.get(0) == (int)collect.get(1)){
            finalScore += scoreThreeInTable().get(collect.get(0));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(3));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(4));
        } else if ((int)collect.get(1) == (int)collect.get(3) && (int)collect.get(1) == (int)collect.get(2)){
            finalScore += scoreThreeInTable().get(collect.get(1));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(0));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(4));
        } else if ((int)collect.get(2) == (int)collect.get(4) && (int)collect.get(2) == (int)collect.get(3)){
            finalScore += scoreThreeInTable().get(collect.get(2));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(0));
            finalScore += (Integer) scoreOneInTable().get((Integer)collect.get(1));
        } else{
            finalScore = collect.stream()
                    .mapToInt(i->(int)GreedDice.scoreOneInTable().get(i)).sum();
        }

        System.out.println(collect);
        System.out.println(finalScore);
        return finalScore;
    }

    public static int greedy(int[] dice) {
        int n[] = new int[7];
        for (int d : dice) {
            n[d]++;
        };
        Arrays.stream(n).forEach(System.out::println);
        int i = n[1] / 3 * 1000 + n[1] % 3 * 100 + n[2] / 3 * 200 + n[3] / 3 * 300 + n[4] / 3 * 400 + n[5] / 3 * 500 + n[5] % 3 * 50 + n[6] / 3 * 600;
        System.out.println(i);
        return i;
    }
    */


    public static int greedy(int[] dice){
        Map<Integer, Long> collect = Arrays.stream(dice)
                                        .boxed()
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int score = 0;
        for (Map.Entry<Integer, Long> e : collect.entrySet()) {
            switch (e.getKey()) {
                case 1: score += ( ( e.getValue() >= 3) ? 1000 : 0) + (e.getValue() % 3) * 100; break;
                case 2: score += ( ( e.getValue() >= 3) ? 200 : 0); break;
                case 3: score += ( ( e.getValue() >= 3) ? 300 : 0); break;
                case 4: score += ( ( e.getValue() >= 3) ? 400 : 0); break;
                case 5: score += ( ( e.getValue() >= 3) ? 500 : 0) + (e.getValue() % 3) * 50; break;
                case 6: score += ( ( e.getValue() >= 3) ? 600 : 0); break;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        greedy(new int[]{5,1,3,4,1});
    }
}

/**
 * Greed is a dice game played with five six-sided dice.
 * Your mission, should you choose to accept it, is to score a throw according to these rules.
 * You will always be given an array with five six-sided dice values.
 *
 *  Three 1's => 1000 points
 *  Three 6's =>  600 points
 *  Three 5's =>  500 points
 *  Three 4's =>  400 points
 *  Three 3's =>  300 points
 *  Three 2's =>  200 points
 *  One   1   =>  100 points
 *  One   5   =>   50 point
 * A single die can only be counted once in each roll.
 * For example, a given "5" can only count as part of a triplet (contributing to the 500 points)
 * or as a single 50 points, but not both in the same roll.
 *
 * Example scoring
 *
 *  Throw       Score
 *  ---------   ------------------
 *  5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 *  1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 *  2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
 * In some languages, it is possible to mutate the input to the function.
 * This is something that you should never do.
 * If you mutate the input, you will not be able to pass all the tests.
 */