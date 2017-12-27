import com.google.common.collect.Lists;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> macList = new ArrayList<>();
        macList.add("1");
        macList.add("2");
        macList.add("3");
        macList.add("4");
        macList.add("5");
        macList.add("6");
        //copy
        List<String> temp = new ArrayList<>(macList);
        System.out.println(temp.size());
        System.out.println(macList.size());
        macList.clear();


        temp.stream().forEach(System.out::println);

        Map<String,String> map = new HashMap<>();
        System.out.println( map.get("222"));


    }
}
