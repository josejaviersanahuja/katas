package com.zitrojjdev.katas;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger a0 = BigInteger.valueOf(1);
        BigInteger a1 = BigInteger.valueOf(1);
        if(n.intValue() == 0) return BigInteger.valueOf(4).multiply(a0);
        if(n.intValue() == 1) return BigInteger.valueOf(4).multiply(a0.add(a1));
        BigInteger temp = a1;
        BigInteger sum = BigInteger.valueOf(2);
        for (int i = 2; i <= n.intValue(); i++) {
            a1 = a1.add(a0);
            a0=temp;
            temp = a1;
            sum = sum.add(a1);
        }

        return BigInteger.valueOf(4).multiply(sum);
    }


    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(4)));
    }
}
