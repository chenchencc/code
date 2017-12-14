package com.jason;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*BigDecimal b = new BigDecimal(1561165);
        BigDecimal b1 = new BigDecimal(19);

        //double avgDuration = b.divide(b1,4,BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(b.setScale(0,BigDecimal.ROUND_HALF_UP).intValue());
        System.out.println(Math.floor(4165156.65151));*/

        String s  = "asas";
        StringBuilder ss = new StringBuilder();
        ss.append(new byte[]{1,2,3});
        String.valueOf(new byte[]{1,2,3});
        System.out.println(ss);

        Map<String,String> map = new HashMap<>();
        map.put("1","11");
        map.put("2","22");
        map.put("3","33");
        map.put("4","44");

        List<String> li = map.values().stream().collect(Collectors.toList());
        li.forEach(System.out::println);
    }
}
