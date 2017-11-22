package com.jason;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(1600);
        BigDecimal b1 = new BigDecimal(19);

        long avgDuration = b.divide(b1,2,BigDecimal.ROUND_HALF_UP).divide(new BigDecimal(60)).longValue();
        System.out.println(avgDuration);
    }
}
