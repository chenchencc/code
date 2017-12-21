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

        String s = null;
        s = "屏幕"; //756710
        s = "电池";//957899
        s = "电源键";//29750419
        s = "扬声器";//24941284
        s = "听筒";//699558
        s = "音量键";//38577266
        s = "静音键";//38478004
        s = "耳机孔";//32381645
        LinkedHashMap mm = new LinkedHashMap();
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        System.out.println(set.add("aaa"));
    }
}
class P{
    String name;
    int age;

        s = "指纹解锁";//787539856
        s = "前后摄像头";//-1350798712

        s = "附件描述";//1166254771
        s = "对应鉴定点";//1027550776
        s = "鉴定结论";//1140501869
        s = "鉴定说明";//1140596416

        s = "表壳材质";//1063040675
        s = "机芯功能";//820095923
        s = "机芯类型";//820417509
        s = "表扣材质";//1065362451
        s = "表带原装";//1064162372
        s = "表带材质";//1064319766



        System.out.println(s.hashCode());
    }

    static final Map<Integer,String> map = new HashMap<>();
    static {
        map.put(756710,"screen");
        map.put(957899,"battery");
        map.put(29750419,"powerButton");
        map.put(24941284,"speaker");
        map.put(699558,"earpiece");
        map.put(38577266,"volumeButton");
        map.put(38478004,"muteButton");
        map.put(32381645,"headphonePlug");
        map.put(787539856,"fingerprintUnlock");
        map.put(-1350798712,"camera");
        map.put(1166254771,"description");
        map.put(1027550776,"identificationPoint");
        map.put(1140501869,"identificationConclusion");
        map.put(1140596416,"identificationDescription");
        map.put(1063040675,"caseMaterial");
        map.put(820095923,"movementFunction");
        map.put(820417509,"movementType");
        map.put(1065362451,"claspMaterial");
        map.put(1064162372,"strapOriginal");
        map.put(1064319766,"strapMaterial");
    }
}
