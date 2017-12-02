package com.jason;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(1561165);
        BigDecimal b1 = new BigDecimal(19);

        double avgDuration = b.divide(b1,4,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(avgDuration);
    }
}
